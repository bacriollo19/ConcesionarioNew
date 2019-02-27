<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuevo auto</title>
</head>
<body>
	<%
		String auto = (String) request.getAttribute("parametroauto");
		String placa = (String) request.getAttribute("parametroplaca");
	%>
	<h2>
		El auto
		<%=auto%>
		con placa
		<%=placa%>
		se agrego correctamente
		</h2>
		<a href="./index.html"> Volver </a>
</body>
</html>