<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/06/2020
  Time: 10:25 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="post" action="calculator">
    <input type="text" placeholder="number1" name="number1">
    <input type="text" placeholder="number2" name="number2"><br><br>
    <input type="submit" value="+" name="calculating" >
    <input type="submit" value="-" name="calculating" >
    <input type="submit" value="*" name="calculating" >
    <input type="submit" value="/" name="calculating" >
</form>
<p>${result }</p>
</body>
</html>
