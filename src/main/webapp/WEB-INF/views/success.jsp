<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Name is : ${user.name }</h1>
<h1>Id is : ${user.id }</h1>
<h1>Gender is : ${user.gender }</h1>
<h1>Dob is : ${user.date }</h1>
<h1>Type is : ${user.type }</h1>
<h1>User subjects are : ${user.subjects }</h1>
<hr>
<h1>User street is : ${user.address.street }</h1>
<h1>User city is is : ${user.address.city }</h1>

</body>
</html>