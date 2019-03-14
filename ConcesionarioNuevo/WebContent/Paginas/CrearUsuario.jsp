<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Creative Colorlib SignUp Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- Custom Theme files -->
<link href="../css/style.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link
	href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i"
	rel="stylesheet">
<!-- //web font -->

<!-- Scripts -->
<script>
	function comprobarClave() {
		clave1 = document.getElementsByName("contrasena")[0].value;
		clave2 = document.getElementsByName("contrasena")[1].value;

		if (clave1 != clave2) {
			alert("Las dos claves son distintas...\n Por favor ingreselas de nuevo");
		}
	}
</script>
</head>
<body background="../images/autos.jpg">
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1 style="color: black">Registrarse</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form method="post" action="/concesionarios/UsuarioController"
					name="registroform">
					<input class="text email" type="text" name="identificacion"
						placeholder="Número de documento" required="required"> <input
						class="text email" type="text" name="nombre1"
						placeholder="Primer Nombre" required="required"> <input
						class="text email" type="text" name="nombre2"
						placeholder="Segundo Nombre" required="required"> <input
						class="text email" type="text" name="apellido1"
						placeholder="Primer Apellido" required="required"> <input
						class="text email" type="text" name="apellido2"
						placeholder="Segundo Apellido" required="required"> <input
						class="text email" type="text" name="telefono"
						placeholder="Teléfono o Celular" required="required"> <input
						class="text email" type="text" name="fechanacimiento"
						placeholder="Fecha de Nacimiento" required="required"> <input
						class="text email" type="text" name="tipopersona"
						placeholder="Tipo Persona (Cliente - Admin - Comer)"
						required="required"> <input class="text email" type="text"
						name="usuario" placeholder="Usuario" required="required">
					<input class="text email" type="email" name="email"
						placeholder="Correo" required="required"> <input
						class="text" type="password" name="contrasena"
						placeholder="Contraseña" required="required"> <input
						class="text w3lpass" type="password" name="contrasena"
						placeholder="Confirmar contraseña" required="required">
					<div class="wthree-text">
						<label class="anim"> <input type="checkbox"
							class="checkbox" required="required"> <span>Aceptar
								terminos y condiciones</span>
						</label>
						<div class="clear"></div>
					</div>
					<input type="submit" value="Registrarme"
						onClick="comprobarClave();"> <a href="../index.html"
						target="_blank">Inicio</a>
				</form>
			</div>
		</div>
		<!-- copyright -->
		<div class="colorlibcopy-agile">
			<p>
				© 2018 Universidad Católica de Colombia. All rights reserved |
				Design by <a href="https://github.com/Arnold0210" target="_blank">Arnold
					Herrera</a>
			</p>
		</div>
		<!-- //copyright -->

	</div>
	<!-- //main -->
</body>
</html>