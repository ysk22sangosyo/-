
 


<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String result = (String) request.getAttribute("result");
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題1</title>
<style>
body {
  border: solid 2px #000080;
  padding: 5px;
}

.result {
  background: #fffacd;
  display: inline-block;
  margin: 5px;
  padding: 10px;
}
</style>
</head>
<body>

  <h1>Java応用 - 演習問題2</h1>

  <h2>ゲームアプリ実行ページ</h2>

  <div class="result">
    <h3>アプリの実行結果</h3>
    
    
     <c:if test="${not empty result}">
     <p>${result}</p>
     </c:if>
     <c:if test="${not empty playTime}">
     <p>${playTime}</p>
     </c:if>
    
  
 
  </div>

  <form action="StartAppServlet" method="post">
    <label>ユーザ名：</label>
    <input type="text" name="name">
    <br>
    <label>アプリ：</label>
    <input type="radio" name="app" value="tranp" checked >トランプ
    <input type="radio" name="app" value="darts" >ダーツ
    <input type="radio" name="app" value="clock" >時計
    <input type="radio" name="app" value="others" >その他
    <br>
    <button type="submit">実行</button>
  </form>
</body>
</html>