<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="emp" items="${msg}">
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