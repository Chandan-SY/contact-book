<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Contacts</title>
</head>
<body>
<table cellpadding="20px" align="center" border="">
<tr>
<th>CID</th>
<th>CName</th>
<th>Phone-Number</th>
<th>Delete</th>
<th>Update</th>
</tr>

<c:forEach  var="contact"    items="${contacts}"   >
<tr>
<td>${contact.getId()}</td>
<td>${contact.getName()}</td>
<td>${contact.getPhonenum()}</td>
<td><a href="delete?id=${contact.getId()}">Delete</a></td>
<td><a href="update?id=${contact.getId()}">Update</a></td>
</tr>


</c:forEach>

</table>
<a href="menu.jsp">Home</a>
</body>
</html>