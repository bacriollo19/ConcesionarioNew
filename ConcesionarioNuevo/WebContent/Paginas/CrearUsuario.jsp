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
</head>
<body>

	<div class="container align-content-center">
		<h2>Formulario</h2>
		<form method="post" action="/concesionarios/UsuarioController">
			<div>
				<div class="input-group flex-nowrap">
					<div class="input-group-prepend">
						<span class="input-group-text" id="addon-wrapping">Cédula
							&#127380;</span>
					</div>
					<input type="text" class="form-control" aria-label="identificacion"
						aria-describedby="addon-wrapping" name="identificacion" />
				</div>
			</div>
			<div>
				<div class="input-group flex-nowrap">
					<div class="input-group-prepend">
						<span class="input-group-text" id="addon-wrapping">Nombre 1
							&#128623;</span>
					</div>
					<input type="text" class="form-control" aria-label="nombre1"
						aria-describedby="addon-wrapping" name="nombre1" />
				</div>
			</div>
			<div>
				<div class="input-group flex-nowrap">
					<div class="input-group-prepend">
						<span class="input-group-text" id="addon-wrapping">Nombre 2
							&#128623;</span>
					</div>
					<input type="text" class="form-control" aria-label="nombre2"
						aria-describedby="addon-wrapping" name="nombre2" />
				</div>
			</div>
			<div>
				<div class="input-group flex-nowrap">
					<div class="input-group-prepend">
						<span class="input-group-text" id="addon-wrapping">Apellido
							1 &#128623;</span>
					</div>
					<input type="text" class="form-control" aria-label="apellido1"
						aria-describedby="addon-wrapping" name="apellido1 " />
				</div>
			</div>
			<div>
				<div class="input-group flex-nowrap">
					<div class="input-group-prepend">
						<span class="input-group-text" id="addon-wrapping">Apellido
							2 &#128623; </span>
					</div>
					<input type="text" class="form-control"
						aria-label="apellido2 &#128623;" aria-describedby="addon-wrapping"
						name="apellido2" />
				</div>
			</div>
			<div>
				<div class="input-group flex-nowrap">
					<div class="input-group-prepend">
						<span class="input-group-text" id="addon-wrapping">Telefono
							&#128222;</span>
					</div>
					<input type="text" class="form-control"
						placeholder="1234567890 &#128241;" aria-label="telefono"
						aria-describedby="addon-wrapping" name="telefono" />
				</div>
			</div>
			<div>
				<div class="input-group flex-nowrap">
					<div class="input-group-prepend">
						<span class="input-group-text" id="addon-wrapping">Correo</span>
					</div>
					<input type="text" class="form-control"
						placeholder="alguien@ejemplo.com" aria-label="email"
						aria-describedby="addon-wrapping" name="email" />
				</div>
			</div>
			<div>
				<div class="input-group flex-nowrap">
					<div class="input-group-prepend">
						<span class="input-group-text" id="addon-wrapping">Fecha de
							Nacimiento &#128197;</span>
					</div>
					<input type="text" class="form-control"
						aria-label="fechanacimiento" placeholder="YYYY-MM-DD &#128198;"
						aria-describedby="addon-wrapping" name="fechanacimiento" />
				</div>
			</div>
			<div>
				<div class="input-group flex-nowrap">
					<div class="input-group-prepend">
						<span class="input-group-text" id="addon-wrapping">Tipo
							Persona &#9845;</span>
					</div>
					<input type="text" class="form-control" aria-label="Tipo Persona"
						aria-describedby="addon-wrapping" name="tipopersona" />
				</div>
			</div>
			<div>
				<div>
					<div class="input-group flex-nowrap">
						<div class="input-group-prepend">
							<span class="input-group-text" id="addon-wrapping">Usuario
								&#128104;</span>
						</div>
						<input type="text" class="form-control" aria-label="Usuario"
							aria-describedby="addon-wrapping" name="usuario" />
					</div>
				</div>
				<div>
					<div class="input-group flex-nowrap">
						<div class="input-group-prepend">
							<span class="input-group-text" id="addon-wrapping">Contraseña
								&#128273;</span>
						</div>
						<input class="form-control" aria-label="password"
							aria-describedby="addon-wrapping" type="password"
							name="contrasena" />
					</div>
				</div>
				<div>
					<span> <input type="submit" value="Registrarme"
						class="btn btn-success">
					</span> <button class="btn btn-danger"><a href="../index.html" style=":link {color:white}">Cancelar</a></button>
				</div>
				<
			</div>
		</form>
	</div>
</body>
</html>