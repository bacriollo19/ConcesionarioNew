<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido</title>
</head>
<body>
	<%
		String miNombre = (String) request.getAttribute("parametronombre");
		String apellido = (String) request.getAttribute("parametroapellido");
	%>
	<h2>
		Bienvenido
		<%=miNombre%>
		<%=apellido%>
		</h2>
		<a href="./index.html"> Volver </a>
</body>
</html>