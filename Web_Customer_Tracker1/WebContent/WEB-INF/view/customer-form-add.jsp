<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>


<link type="text/css"
rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/style.css"
>
<link type="text/css"
rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"
>


<meta charset="ISO-8859-1">
<title>Customer Add</title>
</head>
<body>

<div id="wrapper">
<div id="header">
<h3>CRM-CUSTOMER RELATIONSHIP MANAGER</h3>

</div>
<div id="container">
<h3>Save Customer</h3>
<form:form action="saveCustomer" modelAttribute="customer"  method="POST" >
<form:hidden path="id"/>
<table>
<tbody>
<tr>
<td><label>FirstName:</label></td>
<td><form:input path="firstName"/></td>

</tr>


<tr>
<td><label>LastName:</label></td>
<td><form:input path="lastName"/></td>

</tr>




<tr>
<td><label>Email Id:</label></td>
<td><form:input path="email"/></td>

</tr>

<tr>
<td><label></label></td>
<td><input type="submit" value="Save" class="save"> </td>

</tr>
</tbody>
</table>



</form:form>


<div style="clear;both;"></div>

<p>
<a  href="${pageContext.request.contextPath }/customer/list">Click here to go to the Customer List Page</a>
</p>

</div>
</div>





</body>
</html>