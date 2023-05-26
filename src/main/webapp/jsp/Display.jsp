<%@page import="com.hibernate.model.Auther"%>
<%@page import="java.util.List"%>
<%@page import="com.hibernate.dao.AutherDAOFactory"%>
<%@page import="com.hibernate.dao.AutherDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<style>
@charset "ISO-8859-1";

table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

tr:hover {
	background-color: #c0c0c0;
}

h1 {
	color: black;
}

</style>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="../css/table.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body bgcolor="yellow">
	<%!AutherDAO dao;
		
		public void jspInit()
		{
			dao=AutherDAOFactory.getInstance();
		}
		%>
	<%
		List<Auther> list = dao.allAuther();

		application.setAttribute("list", list);

		
		%>
	<center>
		<h1>---AUTHER LIST---</h1>
		<hr>
		<div class="container">
			<h3></h3>
			<table class="table">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Price</th>
					<th>Book</th>
					<th>Gender</th>
					<th>Update</th>
					<th>Delete</th>

				</tr>

				<c:forEach var="pro" items="${applicationScope.list }">
					<tr>
						<td><c:out value="${pro.id}"></c:out></td>
						<td><c:out value="${pro.name}"></c:out></td>
						<td><c:out value="${pro.email}"></c:out></td>
						<td><c:out value="${pro.price}"></c:out></td>
						<td><c:out value="${pro.book}"></c:out></td>
						<td><c:out value="${pro.gender}"></c:out></td>


						<td><a
							href="${pageContext.request.contextPath}/Updateser?id=${pro.id}">UPDATE</a></td>
						<td><a
							href="${pageContext.request.contextPath}/DeleteData?id=${pro.id}">DELETE</a></td>

					</tr>

				</c:forEach>
				<td><a href='../Welcome.html'>Register</a></td>
			</table>
</body>
</html>