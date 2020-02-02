<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login Page</title>


</head>
<body>
<form>

    <table>


        <thead>
        <tr>
            <td>MID</td>
            <td>Manufacturer Name</td>
            <td>City</td>
            <td>State</td>
            <td>Country</td>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${data}" var="todo" varStatus="counter" >

            <tr>
                <td>${todo.mID}</td>
                <td>${todo.mName}</td>
                <td>${todo.mCity}</td>
                <td>${todo.mcountry}</td>
                <td>${todo.mState}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</form>
</body>
</html>