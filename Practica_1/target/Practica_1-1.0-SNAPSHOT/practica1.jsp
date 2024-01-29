<%-- 
    Document   : practica1
    Created on : Jan 17, 2024, 12:13:43 PM
    Author     : cardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.mycompany.practica_1.Tabla" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilo.css">
        <title>JSP Page</title>
        
    </head>
    <body>
      
        <table>
            <%
                int tabla=Integer.parseInt(request.getParameter("txtTabla"));
                out.println(Tabla.getTabla(tabla));
            %> 
       </table>
    </body>
</html>
