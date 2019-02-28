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
				<input type="submit" value = "Agregar Auto">
			</div>
			<a href="../index.html" style=":link {color:white}"><button class="btn btn-danger"> Cancelar</button></a>
		</form>
	</div>
</body>
</html>