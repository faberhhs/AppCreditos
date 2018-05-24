<%-- 
    Document   : mensaje
    Created on : 2/05/2018, 06:37:48 PM
    Author     : giovanny
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <c:out value="${sessionScope.MENSAJE}"></c:out>
            <a href="${pageContext.servletContext.contextPath}/view/menu.jsp">
               Regresar
            </a>
        </h1>
    </body>
</html>
