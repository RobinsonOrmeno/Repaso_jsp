<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset=utf-8"/>
        <title>Conexion MYSQL con JSTL</title>
    </head>
    <body>
        <h1>Conexion MYSQL con JSTL</h1>
        <sql:setDataSource driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/ventacursos"
                           user="root"
                           password=""
                           var="con"/>
        
        <sql:query dataSource="${con}" var="resultado">
            select * from inscripcion;
        </sql:query>
            
            <c:forEach var="filas" items ="${resultado.rows}">
            <li>
             
                Nombre: <c:out value="${filas.nombre}"/></br>
                Id:<c:out value="${filas.id_inscripcion}"/>
                <hr>
            </li>
            </c:forEach>
    </body>
</html>
