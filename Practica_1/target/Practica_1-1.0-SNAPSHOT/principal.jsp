<%-- 
    Document   : principal
    Created on : Jan 19, 2024, 12:24:50 PM
    Author     : cardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.mycompany.practica_1.Login" %>
<%@page session="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="tabla.css">
        <title>principal</title>
    </head>
    <body>
        <form method="post" action="registrar.jsp">
            <table id="tabla">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>User</th>
                        <th>Password</th>
                        <th>Tipo de Usuario</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody id="usuarios">
                    <tr>
                        <td><input type="text" id="txtId" name="txtId"></td>
                        <td><input type="text" id="txtUser" name="txtUser"></td>
                        <td><input type="password" id="txtPassword" name="txtPassword"></td>
                        <td><input type="text" id="txtTipo" name="txtTipo"></td>
                        <td><input type="submit" value="Registrar"></td>
                    </tr>
                    <%
                        out.println(Login.obtenerTodo());
                        %>
                </tbody>
            </table>
        </form>
    </body>
</html>
