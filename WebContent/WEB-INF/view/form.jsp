<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Hero Input</title>
	
	<link href="<c:url value="/rsc/css/style.css" />" rel="stylesheet">
	</head>
<body>
        <h3>Hero info</h3>
        <form:form method="POST"
          action="/Java-Spring-MVC/form_input" modelAttribute="hero">
             <table>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="type">Type</form:label></td>
                    <td><form:input path="type"/></td>
                </tr>
                <tr>
                    <td><form:label path="mana">Mana</form:label></td>
                    <td><form:input path="mana"/></td>
                </tr>
                <tr>
                    <td><form:label path="hp">Hp</form:label></td>
                    <td><form:input path="hp"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>