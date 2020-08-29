<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%@page import="qbo.com.model.Participante"%>
<%@page import="java.util.List"%>

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
                <h5 class="card-title">Lista de participantes</h5>                                
                <%
                    if (request.getAttribute("listparticipante") != null) {
                    	@SuppressWarnings("unchecked")
                    	ArrayList<Participante> listparticipante = (ArrayList<Participante>)request.getAttribute("listparticipante");
                    	 
                %> 
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">Código</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Apellido</th>
                            <th scope="col">Especialidad</th>
                            <th scope="col">Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Participante objpart : listparticipante) {
                        %>
                        <tr>
                        
                            <td><%=objpart.getId().toString() %></td>
                            <td><%=objpart.getNombres() %></td>
                            <td><%=objpart.getApellidos()%></td>
                            <td scope="row"><%=objpart.getEspecialidad() %></td>
                            <td><a class="btn btn-danger" href="EliminarParticipante?id=<%= objpart.getId().toString() %>">X</a></td>
                        </tr>                    
                        <%  }
                        %>

                    </tbody>
                </table>   
                <%  } else {
                	%>
                	<div class="alert alert-danger" role="alert">
					  No existe información de participantes.
					</div>
                <% }%>
            </div>
        </div>
</body>
</html>