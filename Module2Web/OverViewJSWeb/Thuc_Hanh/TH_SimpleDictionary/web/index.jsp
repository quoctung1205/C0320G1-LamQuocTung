<%--
  Created by IntelliJ IDEA.
  User: tungdz
  Date: 08/06/2020
  Time: 09:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form method="post" action="/translate">
     <input type="text" name="txtSearch" placeholder="Enter your word: "/>
    <input type="submit" id="submid" value="Search"/>
  </form>
  </body>
</html>
