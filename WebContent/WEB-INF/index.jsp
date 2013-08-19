<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>    
<%@ page import="java.util.List" %>
<%@ page import="modele.Personne" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<button id="ajouter"></button>
<div id ="tableauBean">
	<tr>
		<td>Nom</td>
		<td>Prénom</td>
		<td>Telephone</td>
		<td>Anniversaire</td>
		<td>Action</td>
	</tr>
	<% List<Personne> liste = (ArrayList<Personne>)request.getAttribute("listePersonne"); 
    for ( int i = 0; i < liste.size(); i++ ) {
    %>
    <tr>
    	<td><input type="text" value='<%=liste.get(i).getNom() %>' /></td>
    	<td><input type="text" value='<%=liste.get(i).getPrenom() %>' /> </td>
    	<td><input type="text" value='<%=liste.get(i).getTelephone() %>' /></td>
    	<td><input type="text" value='<%=liste.get(i).getDateNaissance() %>' /></td>
    	<td><button class="supp"></button><button class="modif"></button></td>
    </tr>
    <%} %>
</div>

</body>
</html>