<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Contact</title>
</head>
<body>
<form:form action="updateContact" modelAttribute="contact">
<form:hidden path="id"/>
Name:-<form:input path="name" value=""/>
Phone-Number:-<form:input path="phonenum" value=""/>
<input type="submit">
</form:form>
</body>
</html>