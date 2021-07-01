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
        <title>SayHello.jsp</title>
    </head>
    <body>
        <jsp:useBean id="myBean" class="hello.MessageBean"/>
        <h1>SayHello.jsp</h1>
        <% String lang = request.getParameter("lang"); %>
        <jsp:setProperty name="myBean" property="msg" value="<%=lang%>"/>
        <jsp:getProperty name="myBean" property="msg"/>, <%=request.getParameter("nome")%>!
        <div>Formulário de HelloWorld (usando o sayhello.jsp)</div>
           <form action="sayhello.jsp" method="post">
           <br>Idioma: <input type="radio" name="lang" value="pt" checked> Português
           <input type="radio" name="lang" value="en"> Inglês
           <input type="radio" name="lang" value="fr"> Francês
           <input type="radio" name="lang" value="de"> Alemão<br><br>
           Nome: <input type="text" name="nome"/><br><br>
           <input type="submit" value="Cumprimentar"/>
        </form>
    
    
    </body>
</html>
