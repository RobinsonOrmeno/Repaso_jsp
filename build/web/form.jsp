<%-- 
    Document   : form
    Created on : 14-11-2018, 20:20:34
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% request.setCharacterEncoding("utf-8"); %>
<html>
    <head>
        <meta charset=utf-8"/>
        <title>Recibir Datos</title>
    </head>
    <body>
        <h1>Recibiendo el formulario</h1>
        <p>Tu Ip es: <%=request.getRemoteAddr()%>
            <br>
        <p>Tu nombre es: <%=request.getParameter("nombre")%>
            </br>
        <p>Tu Email es: <%=request.getParameter("email")%>
            </br>
         <p>Tu Pais es: <%=request.getParameter("pais")%>
            </br>
         <p>Tu Sexo es: <%=request.getParameter("sexo")%>
              
                   
            </br>
                   
    </body>
</html>
