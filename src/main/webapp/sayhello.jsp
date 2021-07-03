<%-- 
    Document   : sayhello
    Created on : 08/02/2021, 23:08:15
    Author     : viter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Say Hello</title>
    </head>
    <body>
        <h1>Say Hello</h1>        
        <div>Formulário de HelloWorld (usando o sayhello.jsp)</div>
        <form action="/alomundo" method="post">
             <br>Idioma: <input type="radio" name="lang" value="pt" checked> Português
             <input type="radio" name="lang" value="en"> Inglês
             <input type="radio" name="lang" value="fr"> Francês
             <input type="radio" name="lang" value="de"> Alemão
             <input type="radio" name="lang" value="ita"> Italiano
             <input type="radio" name="lang" value="es"> Espanhol<br><br>
             Nome: <input type="text" name="nome"/><br><br>
             <input type="submit" value="Cumprimentar"/>
         </form>    
    </body>
</html>
