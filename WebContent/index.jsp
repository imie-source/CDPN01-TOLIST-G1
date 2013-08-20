<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="modele.Personne"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src="./jsLib/jquery-ui-1.10.3.custom/js/jquery-1.9.1.js"></script>
<script type="text/javascript"
	src="./jsLib/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.js"></script>

<title>Insert title here</title>
</head>
<body>

TEST
	<script type="text/javascript">
		$(document).ready(function() {
			$('#add_row').hide();
			$('#button_add').click(function() {
				$('#add_row').show();
				$('#button_add').hide();

			});
		});
	</script>
<%
if(request.getAttribute("message")!=null){
	%>
	<%=request.getAttribute("message") %>
	<%
}

%>
	<table id="tableauBean">
		<tr>
			<td>ID</td>
			<td>Nom</td>
			<td>Prénom</td>
			<td>Telephone</td>
			<td>Anniversaire</td>
			<td>Action</td>
		</tr>
		<%
			List<Personne> liste = (ArrayList<Personne>) request.getAttribute("carnet");
			for (int i = 0; i < liste.size(); i++) {
		%>
		<tr>
			<form id="form_<%=liste.get(i).getId()%>" method="POST">
	    		<td><input type="text" id="id_<%=liste.get(i).getId() %>" value="<%=liste.get(i).getId() %>" name="id" readonly/></td>
				<td><input type="text" id="nom_<%=liste.get(i).getId()%>" value="<%=liste.get(i).getNom()%>" name="nom"/></td>
				<td><input type="text" id="prenom_<%=liste.get(i).getId()%>" value="<%=liste.get(i).getPrenom()%>" name="prenom" /></td>
	    		<td><input type="text" id="tel_<%=liste.get(i).getId() %>" value="<%=liste.get(i).getTelephone() %>" name ="telephone"/></td>
				<td><input type="text" 	id="dateNaissance_<%=liste.get(i).getId()%>" value="<%=liste.get(i).getDateNaissance()%>" name="dateNaissance" /></td>
				<td><input type="submit" name="action" value="Supprimer">
					<input type="submit" name="action" value="Modifier"></td>
			</form>
		</tr>
		<%
			}
		%>
		<tr id="add_row">
    		<form id="new_form" method="POST" >
			
				<td><input type="text" id="new_id" name="new_id" /></td>
				<td><input type="text" id="new_nom" name="new_nom" /></td>
				<td><input type="text" id="new_prenom" name="new_prenom" /></td>
    			<td><input type="text" id="new_telephone" name="new_telephone"/></td>
				<td><input type="text" id="new_dateNaissance" name="new_dateNaissance" /> </td>
    			<td ><button  name="action" value="Ajouter" >Sauvegarder</button></td>		
			</form>
		</tr>
		
	</table>
	<img id="button_add" src="./add.png" />

</body>
</html>