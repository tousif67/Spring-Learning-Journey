<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Customer Form</title>
    <link rel="stylesheet" href="./style.css">
</head>

<body>
<div class="form-container">
    <h2>Update Customer</h2>

    <form:form action="registerCustomer" modelAttribute="customer">
    	<form:hidden path="id"/>
        First Name: <form:input path="firstName" /><br/>
        Last Name: <form:input path="lastName" /><br/>
        City: <form:input path="city" /><br/>

        <input type="submit" value="Update" />
    </form:form>
</div>
</body>
</html>
