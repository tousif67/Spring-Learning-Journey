<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Customer List</title>
    <link rel="stylesheet" type="text/css" href="./style.css">
</head>

<body>

<div id="wrapper">
    <div id="header">
        <h1>Customer Relationship Management Application</h1>
    </div>
</div>

<div id="container">
    <div id="content">

        <!-- Register Button -->
        <input type="button" value="RegisterCustomer"
               onClick="window.location.href='/CRMApp/showForm'; return false;"
               class="add-button" />

        <h2>Customer List</h2>

        <table border="1">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>City</th>
                <th>Update Data</th>
                <th>Delete Data</th>
            </tr>

            <c:forEach var="cust" items="${customers}">
             <c:url var="updateLink" value="/updateCustomer">
        <c:param name="cxid" value="${cust.id}" />
    </c:url>
    
    			<c:url var="deleteLink" value="/deleteCustomer">
        <c:param name="cxid" value="${cust.id}" />
    </c:url>
                <tr>
                    <td>${cust.firstName}</td>
                    <td>${cust.lastName}</td>
                    <td>${cust.city}</td>

                   <td>
                        <a href="${updateLink}">Update</a>
                    </td>

                     <td>
                        <a href="${deleteLink}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>

    </div>
</div>

</body>
</html>
