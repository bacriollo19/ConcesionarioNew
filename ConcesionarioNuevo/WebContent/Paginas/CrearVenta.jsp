<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Venta de autos</title>
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
<body background="../images/venta.jpg">
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1 style="color: black">Venta de autos</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form method="post" action="/concesionarios/VentaController">
					<input class="text email" type="text" name="idVenta"
						placeholder="Identificación de la venta" required="required">
					<input class="text email" type="text" name="idAuto"
						placeholder="Identificacion del auto" required="required">
					<input class="text email" type="text" name="idCliente"
						placeholder="Documento del Cliente" required="required"> <input
						class="text email" type="text" name="valor"
						placeholder="Valor de venta" required="required">
					<div>
						<input type="submit" value="Vender">
					</div>
					<a href="../index.html" target="_blank">Inicio</a>
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