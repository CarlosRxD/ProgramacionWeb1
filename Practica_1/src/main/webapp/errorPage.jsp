<%-- 
    Document   : errorPage
    Created on : Jan 22, 2024, 12:12:57 PM
    Author     : cardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Errores</h1>
        <%=response.getStatus() %>
        <%=exception %>
        
    </body>
</html>
