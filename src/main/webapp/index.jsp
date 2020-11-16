<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hola mundo</h1>
<% out.print("<p>Hola buenas</p>"); %>
<a href="listaPerros">Enlace</a>
<form method="post" action="listaPerros">
 <p>Esto envia datos por POST al controlador</p>
 <input type="text" name="nombre" placeholder="Nombre del perro" required>
 <br>
 <input type="text" name="raza" placeholder="Raza del perro" required>
 <br>
 Marca si esta Vacunado
 <input type="checkbox" name="vacunado">
 <br>
 <textarea name="historia" cols="30" rows="5" placeholder="Cuentame la historia del perro"></textarea> 
 <br>
 <input type="submit" value="Enviar">
</form>

</body>
</html>