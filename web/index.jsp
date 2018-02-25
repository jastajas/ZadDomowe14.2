<%--
  Created by IntelliJ IDEA.
  User: Madi_i_Jack
  Date: 2018-02-25
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Text_Tester</title>
  </head>
  <body background="tlo.png" bgproperties="fixed">
  <h1 style="color: #f5f5f5">Przelicznik tekstu</h1><br/>
  <form method="post" action="http://localhost:8080/AnalyserServlet">
  <textarea placeholder="Wpisz dowolny tekst" cols="60" rows="10" name="toAnalyze"></textarea><br/>
    <input type="submit" value="Analizuj">
  </form><br/>
  </body>
</html>
