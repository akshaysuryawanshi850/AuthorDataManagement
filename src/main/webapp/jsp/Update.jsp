<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body bgcolor="tan">
<form action="Updateser2"method="get">
<center>
<h2>UPDATE DATA</h2>
<hr>
AUTHER ID:-<input type="text"name="id" value="${requestScope.au.id}"readonly="readonly"><br>
AUTHER NAME:-<input type="text"name="name" value="${requestScope.au.name}"><br>
AUTHER EMAIL:-<input type="text"name="email"value="${requestScope.au.email}"><br>
AUTHER PRICE:-<input type="text"name="price"value="${requestScope.au.price}"><br>
AUTHER BOOK:-<input type="text"name="book"value="${requestScope.au.book }"><br>
AUTHER GENDER:-<input type="text"name="gender"value="${requestScope.au.gender}"><br>

<input type="submit"value="UPDATE"><br>
</center>
</body>
</html>