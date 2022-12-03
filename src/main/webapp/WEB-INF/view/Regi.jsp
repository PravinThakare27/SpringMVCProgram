<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
	<table>
	
			<tr>
				<th>Id</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>Name</th>
				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<th>City</th>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				
				<td><input type="submit" value="INsert" onclick="document.forms[0].action='index';return true">
				<td><a href="fetch">View All Records</a></td> 
				<td><input type="submit" value="Submit"></td>
				<td><input type="submit" value="Submit"></td>
			</tr>

	</table>
	</form>
				<c:forEach var="emp" items="${all}">
   <tr>
   <td>${emp.id}
   </td>
   <td>${emp.name}
   </td>
   <td>${emp.city}
   </td>
   <td>${emp.email}
   </td>
   <td>${emp.password}
   </td>
   
   </tr>
</c:forEach>
</body>
</html>