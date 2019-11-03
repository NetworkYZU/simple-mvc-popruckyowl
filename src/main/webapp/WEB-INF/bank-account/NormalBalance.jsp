<%-- 
    Document   : NegativeBalance
    Created on : Sep 24, 2018, 7:28:21 AM
    Author     : lendle
--%>

<%@page import="lendle.courses.network.simplemvc.BankCustomer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            BankCustomer customer=(BankCustomer)request.getAttribute("customer");
        %>
        <h1>Hello, <%=customer.getFirstName()%></h1>
        窮逼繼續存款！
    </body>
</html>
