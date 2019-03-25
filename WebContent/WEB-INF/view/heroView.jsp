<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Heroes View</title>
</head>
<body>
    <h2>Hero Submitted</h2>
    <table>
        <tr>
            <td>Name :</td>
            <td>${name}</td>
        </tr>
        <tr>
            <td>Type :</td>
            <td>${type}</td>
        </tr>
        <tr>
            <td>Attack Speed:</td>
            <td>${atkspd}</td>
        </tr>
        <tr>
            <td>Mana:</td>
            <td>${mana}</td>
        </tr>
        <tr>
            <td>Hp:</td>
            <td>${hp}</td>
        </tr>
    </table>
    <h3><a href="/Java-Spring-MVC/home/">Back home</a></h3>
</body>
</html>