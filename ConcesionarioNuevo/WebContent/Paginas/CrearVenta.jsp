<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>Venta de autos</title>
</head>
<body>
	<h2>Venta</h2>
	<div>
		<form method="post" action="/concesionarios/VentaController">
			<div>
				<label for="name">Identificaci�n Venta</label>
				<input type="text" name="idVenta"/>
			</div>
			<div>
				<label for="name">Identificaci�n auto</label>
				<input type="text" name="idAuto"/>
			</div>
			<div>
				<label for="name">Identficaci�n cliente</label>
				<input type="text" name="idCliente"/>
			</div>
			<div>
				<label for="name">Valor final venta</label>
				<input type="text" name="valor"/>
			</div>
			<div>
				<input type="submit" value = "Vender">
			</div>
		</form>
	</div>
</body>
</html>