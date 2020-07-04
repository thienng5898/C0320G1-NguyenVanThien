<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 08/06/2020
  Time: 2:12 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <style>
    #customers {
      font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
      border-collapse: collapse;
      width: 100%;
    }
    img {
      transition: transform .2s;
      height: auto;
      width: 150px;
    }
    img:hover{
      transform: scale(2);
    }
    #customers td, #customers th {
      border: 1px solid #ddd;
      padding: 8px;
    }
    #customers tr:nth-child(even){background-color: #f2f2f2;}
    #customers tr:hover {background-color: #ddd;}
    #customers th {
      padding-top: 12px;
      padding-bottom: 12px;
      text-align: center;
      background-color: #4CAF50;
      color: white;
    }
  </style>
  <table border="1px">
    <caption><h1>List Customers</h1></caption>
    <tr>
      <th>Name</th>
      <th>Birthday</th>
      <th>Address</th>
      <th>Image</th>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
      <tr>
        <td>${customer.getName()}</td>
        <td>${customer.getBirthday()}</td>
        <td>${customer.getAddress()}</td>
        <td><img src=${customer.getImage()} width="60px" height="40px" alt="Image"></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
