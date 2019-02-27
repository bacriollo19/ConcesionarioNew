<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.DTOs.Cliente" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
</body>
</html>