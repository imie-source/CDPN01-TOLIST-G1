package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.Personne;

import controller.AddressBook;
import controller.IMIEAddressBook;

/**
 * Servlet implementation class Todo
 */
public class CarnetAdresse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static AddressBook iab = new IMIEAddressBook();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CarnetAdresse() {
		super();
		iab.addPerson("Bob", "Morane", "0000000000", "12/09/2000");
		iab.addPerson("Bob", "le bricoleur", "0123456789", "12/08/2000");
		iab.addPerson("Bob", "l'éponge", "6666666666", "");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("action")!=null){
			if("ajouter".equals(request.getParameter("action"))){
				if(request.getParameter("nom")!=null&&request.getParameter("prenom")!=null&&request.getParameter("telephone")!=null&&request.getParameter("dateNaissance")!=null) {
					String id=null;
					id=iab.addPerson(request.getParameter("nom").toString(), request.getParameter("prenom").toString(), request.getParameter("telephone").toString(), request.getParameter("dateNaissance").toString());
					if(id!=null){
						request.setAttribute("message","Creation effectu�e avec succés");
					}else{
						request.setAttribute("message","Echec de la création");
						request.setAttribute("error",001);//Code erreur création de personne
					}
				}else if("supprimer".equals(request.getParameter("action"))){
					iab.removePerson(request.getParameter("id"));

				}else if("modifier".equals(request.getParameter("action"))){
					Personne per = new Personne(request.getParameter("nom").toString(), request.getParameter("prenom").toString(), request.getParameter("telephone").toString(), request.getParameter("dateNaissance").toString());
					iab.modifierPerson(request.getParameter("id"),per);
				}

			}
		}
		request.setAttribute("carnet",iab.getPeople());
		renvoyer("index.jsp",request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	private void renvoyer(String url,HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
