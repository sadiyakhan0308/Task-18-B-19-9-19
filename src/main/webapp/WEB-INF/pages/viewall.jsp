<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page isELIgnored="false" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All students</title>
</head>
<body>
<h2>Details are........!</h2>
<hr>
<div class="container">
<table>

 <tr>
		<th>RollNo</th><th>Name</th><th>Branch</th><th>Sem</th>
	<tr>
	<c:forEach var="student" items="${students}">
		<tr>
			<td>${student.rno}</td>
			<td>${student.name}</td>
			<td>${student.dept}</td>
			<td>${student.sem}</td>
			
		</tr>
	</c:forEach>
	</table>
   
</div>
<hr>
 <a href="index.jsp">Home</a>

</body>
</html>