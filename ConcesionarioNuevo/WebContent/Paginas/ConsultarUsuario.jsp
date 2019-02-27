<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.DTOs.Cliente" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Consultar usuario</h2>
	<div>
		<form method="get" action="/concesionarios/UsuarioController">
			<div>
				<label for="name">Identificación: </label> <input type="text"
					name="identificacion" />
			</div>
			<div>
				<input type="submit">
			</div>
		</form>
		
	</div>
</body>
</html>