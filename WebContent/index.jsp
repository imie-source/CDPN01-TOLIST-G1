<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>    
<%@ page import="java.util.List" %>
<%@ page import="modele.Personne" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src="./jsLib/jquery-ui-1.10.3.custom/js/jquery-1.9.1.js"></script>
<script type="text/javascript"
	src="./jsLib/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.js"></script>

<title>Insert title here</title>
 <style type="text/css">
	  .cache{
		display:none;
	}
	
	.visible{
		display:block;
	}
  </style>
</head>
<body>

<button id="ajouter">Ajouter</button>
<table id ="tableauBean">
	<tr>
		<td>Nom</td>
		<td>Prénom</td>
		<td>Telephone</td>
		<td>Anniversaire</td>
		<td>Action</td>
	</tr>
	<% List<Personne> liste = (ArrayList<Personne>)request.getAttribute("carnet"); 
    for ( int i = 0; i < liste.size(); i++ ) {
    %>
    <tr>
    	<td><input type="text" id="nom_<%=i %>" value="<%=liste.get(i).getNom() %>" /></td>
    	<td><input type="text" id="prenom_<%=i %>" value="<%=liste.get(i).getPrenom() %>" /> </td>
    	<td><input type="text" id="tel_<%=i %>" value="<%=liste.get(i).getTelephone() %>"/></td>
    	<td><input type="text" id="dateNaissance_<%=i %>" value="<%=liste.get(i).getDateNaissance() %>" /></td>
    	<td><button class="supp">Supprimer</button><button class="modif">Modifier</button></td>
    </tr>    
    <%}%>
    <tr>
    	<td class="cache"><input type="text" id="new_nom" /></td>
    	<td class="cache"><input type="text" id="new_prenom" /> </td>
    	<td class="cache"><input type="text" id="new_tel" /></td>
    	<td class="cache"><input type="text" id="new_dateNaissance" /></td>
    	<td class="cache"><button class="supp"></button><button class="modif"></button></td>
    </tr>
</table>

</body>
</html>