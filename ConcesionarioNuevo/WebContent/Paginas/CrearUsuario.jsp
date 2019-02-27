<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>	Crear usuario</title>
</head>
<body>
	<h2>Formulario</h2>
	<div>
		<form method="post" action="/concesionarios/UsuarioController">
			<div>
				<label for="name">Identificación: </label> <input type="text"
					name="identificacion" />
			</div>
			<div>
				<label for="name">Nombre 1:</label> <input type="text"
					name="nombre1" />
			</div>
			<div>
				<label for="name">Nombre 2:</label> <input type="text"
					name="nombre2" />
			</div>

			<div>
				<label for="name">Apellido 1:</label> <input type="text"
					name="apellido1" />
			</div>
			<div>
				<label for="name">Apellido 2:</label> <input type="text"
					name="apellido2" />
			</div>
			<div>
				<label for="name">Telefono:</label> <input type="text"
					name="telefono" />
			</div>
			<div>
				<label for="name">Correo:</label> <input type="text" name="email" />
			</div>
			<div>
				<label for="name">Fecha nacimiento:(yyyy-MM-dd)</label> <input
					type="text" name="fechanacimiento" />
			</div>
			<div>
				<label for="name">Tipo persona:</label> <input type="text"
					name="tipopersona" />
			</div>
			<div>
				<label for="name">Usuario:</label> <input type="text" name="usuario" />
			</div>
			<div>
				<label for="name">Contraseña:</label> <input type="password"
					name="contrasena" />
			</div>
			<div>
				<input type="submit">
			</div>
		</form>
	</div>
</body>
</html>