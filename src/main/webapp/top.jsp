<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
  <c:if test="${not empty msg}">
    <p>${msg}</p>
  </c:if>
  <p>検索条件を入力してください。  </p>
    
  <form action="LoginServlet" method="post">
    product_id <input type="text" name="product_id"><br>
    <button type="submit">検索</button>
  </form>
</body>
</html>

