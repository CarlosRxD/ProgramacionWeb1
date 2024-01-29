<%-- 
    Document   : index
    Created on : Jan 19, 2024, 12:10:40 PM
    Author     : cardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%@page errorPage="errorPage.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="estilo.css">
    </head>
    <body >
        <jsp:include page="Head.html" />
        <jsp:include page="Footer.html" />  

        <form method="post" action="login.jsp">
            <label for="txtUser">User</label>
            <input type="text" id="txtUser" name="txtUser">
            <label for="txtPassword">Password</label>
            <input type="password" id="txtPassword" name="txtPassword">
            <input type="submit" value="Log in">
            <br>
        </form>
        

    </body>
</html>
