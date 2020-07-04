<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 08/06/2020
  Time: 9:02 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>

  </head>
  <form method="post" action="/display_discount">
    <label>Price: </label>
    <input type="text" name="price" placeholder="ListPrice" /><br/>
    <label>Discount percent: </label>
    <input type="text" name="discount" placeholder="Discount Percent" /><br/>
    <input type="submit" id="submit" value="Calculate Discount"/>
  </form>
</html>
