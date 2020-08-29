<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="scriptstyle.jsp"%>
</head>
<body>
<%@include file="layout.jsp"%>
<div class="card">		
		<div class="card-body">
			<h5 class="card-title">Registrar Participante</h5>
			<form method="post" action="RegistarParticipante">
				<div class="form-group">
					<label for="txtnombre">Nombres:</label> 
					<input type="text" class="form-control" name="txtnombre" id="txtnombre">
				</div>
				<div class="form-group">
					<label for="txtapellido">Apellidos:</label> 
					<input type="text" class="form-control" name="txtapellido" id="txtapellido">
				</div>
				<div class="form-group">
					<label for="txtespecialidad">Especialidad:</label> 
					<input type="text" class="form-control" name="txtespecialidad" id="txtespecialidad">
				</div>				
				<button type="submit" class="btn btn-primary">Registrar</button>
			</form>
		</div>
	</div>
</body>
</html>