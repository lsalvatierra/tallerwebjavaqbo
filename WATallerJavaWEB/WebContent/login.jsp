<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Autenticación</title>
<%@include file="scriptstyle.jsp"%>
</head>
<body>
	<div class="card">
		<div class="card-header badge-primary">Autenticación</div>
		<div class="card-body">
			<form method="post" action="AutenticacionController">
				<div class="form-group">
					<label for="txtusuario">Email address</label> <input type="text"
						class="form-control" name="txtusuario" id="txtusuario">
				</div>
				<div class="form-group">
					<label for="txtpassword">Password</label> <input type="password"
						class="form-control" name="txtpassword" id="txtpassword">
				</div>
				<button type="submit" class="btn btn-primary">Ingresar</button>
			</form>
		</div>
	</div>
</body>
</html>