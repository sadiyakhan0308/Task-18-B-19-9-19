<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
	border-collapse: collapse;
	width: 35%;
	height: 99px;
	text-align: center;
}

h6 {
	font-size: large;
}
.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 30px;
	width: 507px;
	margin-left: 475px;
}
</style>

</head>
<body>
<h3 align="center"
		style="color: #444; font-size: x-large; text-decoration: underline;">
		Search-Details-of-Student</h3>
	<hr>
	<div class=container>
		<form action="searchPage">
	
	<br>
	<br>
	
			
			<table align="center">
				<tr>
					<th>Enter the student Rollno.</th><br>
			
			     </tr>
			     <tr>
			         <td><input type="text" name="rno"  /></td>
					</tr>
                 <tr>
					<td align="center" colspan="2"><input type="submit"
						value="Search" /></td>
				</TR>
			

			</table>
	<br>
	<br>

	</form>
</div>
	<hr>
  <a href="searchPage.jsp">Search-More-Students</a><br>
   <a href="index.jsp">Home</a>

</body>
</html>