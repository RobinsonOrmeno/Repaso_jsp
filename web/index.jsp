<%-- 
    Document   : index
    Created on : 14-11-2018, 11:16:44
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=utf-8"/>
        <title>Formulario</title>
    </head>
    <body>
        <jsp:useBean id="t" scope="request" class="com.test_entrevista.modelos.test_Model" />
        <jsp:setProperty name="t" property="nombre" value="Robinson Ormeño" />
        Elnombre desde el EJB es :<jsp:getProperty name="t" property="nombre" />
        <hr>
        El Email es : <jsp:getProperty name="t" property="correo"/>
        <hr>
        <br>
        <h1>Ingrese sus datos</h1>
        <form action ="form.jsp" method="post">
            <label for="nombre">Nombre </label>
            <input type="text" name="nombre" required/><br>
             <label for="email">E-Mail </label>
            <input type="email" name="email" required/><br>
             <label for="nombre">Pais </label>
             <select name="pais" required>
                 <option value="cl">Chile</option>
                  <option value="pe">Peru</option>
                  <option value="vn">Venezuela</option>
                  <option value="mx">Mexico</option>
                  <option value="ar">Argentina</option>             
             </select><br>
             <label for="sexo" required>Sexo</label><br>
             Masculino <input type="radio" name="sexo" value="m"/>
             Femenino <input type="radio" name="sexo" value="f"/>
             <hr/><input type="submit" value="Enviar" title="Enviar">
        </form>
    <li> <a href="Nosotros">Nosotros</a></li>
    <li>  <a href="Mision">Mision</a></li>
        
    </body>
</html>
