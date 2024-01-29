<%@page session="true" %>
<%@ page import="com.mycompany.practica_1.Login" %>
<%
     String user = request.getParameter("txtUser");
     String pass = request.getParameter("txtPassword");
    boolean x = Login.existeUsuario(user,pass);
    if(x){
        HttpSession sesion=request.getSession();
        sesion.setAttribute("user","administrador");
        
          %>
     <jsp:forward page="principal.jsp"/>
     <%
     }else{
     %>
     <jsp:forward page="index.jsp">
     <jsp:param name="error" value="El usuario y contraseña es incorrecto"/>
     </jsp:forward>
     <%
    }
%>