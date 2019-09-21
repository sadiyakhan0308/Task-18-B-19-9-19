<%@page isELIgnored="false" %>
<html>
<body>
	<h3>STUDENT'S RECORD SUCCESSFULLY STORED</h3>
	<h4>Following Details Are Saved : </h4>
	<hr>
	<table align="center" cellpadding = "10" >
 
<tr>
<td>RollNo  ${student.rno}</td>
</tr>
<tr>
<td>Name  ${student.name}</td>
</tr>
<tr>
<td>Branch  ${student.branch}</td>
</tr>
<tr>
<td>Semester ${student.sem}</td>
</tr>
</table>				
	<hr>
	<a href="studententry">Add-More</a><br>
	<a href="index.jsp">Home</a><br>
</body>
</html>