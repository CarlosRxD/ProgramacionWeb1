<%-- 
    Document   : registrar
    Created on : Jan 24, 2024, 1:23:38 PM
    Author     : cardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.mycompany.practica_1.Login" %>
<%@page session="true" %>

<%
    int id = Integer.parseInt(request.getParameter("txtId"));
    String user = request.getParameter("txtUser");
    String pass = request.getParameter("txtPassword");
    int tipo = Integer.parseInt(request.getParameter("txtTipo"));
     Login.insertarUsuario(id,user,pass,tipo);
%> 
<jsp:forward page="principal.jsp"/>
