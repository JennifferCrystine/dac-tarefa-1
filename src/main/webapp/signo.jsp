<%-- 
    Document   : signo.jsp
    Created on : 2 de jul de 2021, 19:15:55
    Author     : jenniffer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>ð
        <h1>O olho que tudo vÃª ð</h1>
        <h4>Me digas o dia e o mÃªs do seu nascimento e te direis teu signo ð</h4>
        <form action="/descubra" method="post">
             <input type="date" name="dtNascimento" value="dtNasc"><br><br>
             <input type="submit" value="Adivinhe!"/>
         </form>   
    </body>
</html>
