<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="message" type="com.diazdevin.expensetracker.controller.MasterController"--%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Demo | Welcome</title>
    <link rel="stylesheet" type="text/css" href="css/main-page.css/">
</head>

<body>

    <div class="header-container">
        <div>
            <h1>Expense Tracker By Diaz</h1>
        </div>
    </div>
    <img class="img-details1" src="<%=request.getContextPath()%>/images/mainLogo.webp/">
    <img class="img-details2" src="<%=request.getContextPath()%>/images/mainLogo.webp/">

    <div class="center">
        <p class="title">${message}</p>


        <a href="${contextRoot}/expense">
            <button class="add-button">Add Expense</button>
        </a>


        <div class="expense-container">
            <div class="table-container">
                <c:forEach var="expense" items="${expenses}">
                    <div class="object-expense-container">
                        <h3>${expense.expenseName}</h3>
                        <p>&#36;${expense.amount}</p>
                        <p>${expense.note}</p>
                        <a href="${contextRoot}/expense/${expense.id}">
                            <button class="edit-button">Edit Expense</button>
                        </a>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>





</body>
</html>


