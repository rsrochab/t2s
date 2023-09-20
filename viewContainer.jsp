

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Containers</title>
</head>
<body>
	<%@ page import="java.util.List"%>
	<%@ page import="br.com.t2bContainer.dao.*, br.com.t2bContainer.bean.*"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	
	
	<%
	List<Container> list = containerDAO.getAllContainers();
	request.setAttribute("list", list);
	%>
	
	<h1>Listagem de Containers</h1>
	
	<table>
		<tr>
			<th>ID</th>
			<th>Cliente</th>
			<th>Nº Container</th>
			<th>Tipo</th>
			<th>Status</th>
			<th>Categoria</th>
		</tr>
		<c:forEach items="${list}" var="container">
			<tr>
				<td>${container.getId()}</td>
				<td>${container.getCliente()}</td>
				<td>${container.getNroContainer()}</td>
				<td>${container.getTipo()}</td>
				<td>${container.getStatus()}</td>
				<td>${container.getCategoria()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>