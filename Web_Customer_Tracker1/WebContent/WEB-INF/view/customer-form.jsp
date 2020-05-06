<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>




	<div id="wrapper">
		<div id="header">
			<h2>Customer Relationship Manager</h2>
		</div>
		<div id="container">
			<div id="content">
				<input type="button" value="Add Customer"
					onclick="window.location.href='showFormForAdd';return false"
					; class="add-button">
			</div>
		</div>
		<table>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${customer}" var="tempCustomer">

				<c:url var="updateLink" value="/customer/showFormForUpdate">
 							<c:param name="customerId" value="${ tempCustomer.id}"></c:param>
				</c:url>
				
				<c:url var="deleteLink" value="/customer/delete">
 							<c:param name="customerId" value="${ tempCustomer.id}"></c:param>
				</c:url>
				<tr>
					<td>${tempCustomer.firstName}</td>
					<td>${tempCustomer.lastName}</td>
					<td>${tempCustomer.email}</td>
					<td>
					<a href="${updateLink}">Update</a>
					
					<a href="${deleteLink }">Delete</a>
					</td>
					
				</tr>

			</c:forEach>



		</table>




	</div>
	</div>
</body>
</html>