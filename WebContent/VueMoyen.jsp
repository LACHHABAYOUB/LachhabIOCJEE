<%@page import="pres.ModelMoyen"%>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	ModelMoyen model= (ModelMoyen)request.getAttribute("mod");
  %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Moyenne</title>
</head>
<body>

	<div style="align:center">
		<table >
			<thead>
			<tr>
				<th>N°</th>
				<th>Value</th>
			</tr>
			</thead>
			<tbody>
			<% int i=0; %>
			<c:forEach  items="${model.tab}" var="p">
				<tr>
				
					<td><%= i %></td>
					<% i++; %>
					<td>${p}</td>
				</tr>
			</c:forEach>
			<tr>
			<td class="MoyenALin"> Moyenne:	${model.moyenne } </td>
			</tr>
				
			</tbody>
		</table>
	</div>
</body>
</html>