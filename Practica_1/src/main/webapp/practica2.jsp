<%-- 
    Document   : practica2
    Created on : Jan 17, 2024, 1:39:47 PM
    Author     : cardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.mycompany.practica_1.Nombre" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
       <%
                String nombre=request.getParameter("txtNombre");
                out.println(Nombre.getVocales(nombre));
            %> 
        </div>
    </body>
</html>
