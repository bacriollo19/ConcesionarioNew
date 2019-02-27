<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuevo auto</title>
</head>
<body>
	<h2>Formulario del automovil</h2>
	<div>
		<form method="post" action="/concesionarios/AutoController">
			<div>
				<label for="name">Identificación del auto: </label> <input
					type="text" name="identificacion" />
			</div>
			<div>
				<label for="name">Marca:</label> <input type="text" name="marca" />
			</div>
			<div>
				<label for="name">Nombre:</label> <input type="text" name="nombre" />
			</div>
			<div>
				<label for="name">Placa:</label> <input type="text"
					name="placa" />
			</div>
			<div>
				<label for="name">Tipo:</label> <input type="text"
					name="tipo" />
			</div>
			<div>
				<label for="name">Valor:</label> <input type="text"
					name="valor" />
			</div>
			<div>
				<input type="submit">
			</div>
		</form>
	</div>
</body>
</html>