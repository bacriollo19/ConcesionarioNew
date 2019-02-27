<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String auto = (String) request.getAttribute("parametroauto");
		String nombre = (String) request.getAttribute("parametronombre");
	%>
	<h2>
		Venta del auto
		<%=auto%>
		realizada a
		<%=nombre%>
		fue exitosa
		</h2>
		<a href="./index.html"> Volver </a>
</body>
</html>