<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/06/2020
  Time: 5:10 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiment</h1>
<form action="save" method="post" >
<input type="checkbox" name="condiment" value="lettuce">
<label>Lettuce</label>
<input type="checkbox" name="condiment" value="tomato">
<label>Tomato</label>
<input type="checkbox" name="condiment" value="mustard">
<label>Mustard</label>
<input type="checkbox" name="condiment" value="sprouts">
<label>Sprouts</label>
<input type="submit" value="save">
</form>
<c:forEach items="${condiments}" var="con">
    <p>${con}</p>
</c:forEach>


</body>
</html>
