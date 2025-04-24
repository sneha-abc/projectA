 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

 <%@ page isELIgnored="false"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h1>data is fetching</h1>
<a href="next">back</a>
<table border="1">
<tr>
<th>studentName</th>
<th>parentName</th>
<th>age</th>
<th>phoneNumber</th>
<th>email</th>
<th>birthDate</th>
<th>address</th>
<th>profile</th>
<th>Delete</th>
<c:forEach items="${fetch}" var="SingleDto">
<tr>
<td>${SingleDto.studentName}</td>
<td>${SingleDto.parentName}</td>
<td>${SingleDto.age}</td>
<td>${SingleDto.phoneNumber}</td>
<td>${SingleDto.email}</td>
<td>${SingleDto.birthDate}</td>
<td>${SingleDto.address}</td>
<td><a href="getProfilePage?id=${SingleDto.id}">Edit</a></td>
<td><a href="deleteData/${SingleDto.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>