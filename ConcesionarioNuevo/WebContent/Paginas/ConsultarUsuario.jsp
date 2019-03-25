<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="org.taller.model.DTOs.Cliente"%>
<!DOCTYPE html>
<html>
<head>
<title>Consultar Usuario</title>
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
</head>
<body background="../images/consulta.jpg">
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1 style="color: black">Consultar auto</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form method="get" action="/concesionarios/UsuarioController">
					<input class="text email" type="text" name="identificacion"
						placeholder="Numero de documento" required="required">
					<div>
						<input type="submit" value="Consultar"> <a
							href="../index.html" target="_blank">Inicio</a>
					</div>
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
</body>
</html>