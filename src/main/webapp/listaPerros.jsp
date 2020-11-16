<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista</h1>
		<ul>
		 <c:forEach items="${listaPerros}" var="perro">
		 	<li>${perro.id} <a href="DetallesController?id=${perro.id}">${perro.nombre}</a> ${perro.raza}</li>	
		 </c:forEach>
	 	</ul>
</body>
</html>