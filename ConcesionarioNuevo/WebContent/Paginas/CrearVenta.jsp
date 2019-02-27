<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Venta de autos</title>
</head>
<body>
	<h2>Venta</h2>
	<div>
		<form method="post" action="/concesionarios/VentaController">
			<div>
				<label for="name">Identificación Venta</label>
				<input type="text" name="idVenta"/>
			</div>
			<div>
				<label for="name">Identificación auto</label>
				<input type="text" name="idAuto"/>
			</div>
			<div>
				<label for="name">Identficación cliente</label>
				<input type="text" name="idCliente"/>
			</div>
			<div>
				<label for="name">Valor final venta</label>
				<input type="text" name="valor"/>
			</div>
			<div>
				<input type="submit">
			</div>
		</form>
	</div>
</body>
</html>