<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
    <tr>
      <th>user_id</th>
      <th>user_name</th>
      <th>price</th>
    </tr>
<tr>
  <td>${fn:escapeXml(product.productId)}</td>
  <td>${fn:escapeXml(product.productName)}</td>
  <td>${fn:escapeXml(product.price)}</td>
  </tr>
  </table>
  <form action ="top.jsp">
  <button type="submit">戻る</button>
  </form>
</body>
</html>