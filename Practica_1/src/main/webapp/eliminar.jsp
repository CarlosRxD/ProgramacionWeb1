<%-- 
    Document   : eliminar
    Created on : Jan 26, 2024, 12:29:12 PM
    Author     : cardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.mycompany.practica_1.Login" %>
<%@page session="true" %>

<%
    int id = Integer.parseInt(request.getParameter("txtID"));
    Login.eliminar(id);
%> 
<jsp:forward page="principal.jsp"/>