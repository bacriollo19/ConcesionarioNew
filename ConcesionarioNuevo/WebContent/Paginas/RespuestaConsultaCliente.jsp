<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.taller.model.DTOs.Cliente" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<title>Informacion cliente</title>
</head>
<body>
	<div>
			<%
				Cliente cliente = (Cliente) request.getAttribute("parametrocliente");
			%>
			<div>
				Nombres: <%=cliente.getNombre1()%> <%=cliente.getNombre2() %>
			</div>
			<div>
				Apellidos: <%=cliente.getApellido1() %> <%=cliente.getApellido2() %>
			</div>
			<div>
				Telefono: <%=cliente.getTelefono() %>
			</div>
			<div>
				Correo: <%=cliente.getCorreo() %>
			</div>
			<div>
				Tipo de persona: <%=cliente.getTipo() %>
			</div>
		</div>
		<a href="./index.html" style=":link {color:white}"><button class="btn btn-info"> Inicio</button></a>
</body>
</html>