<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
User user = (User)application.getAttribute("user");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>registResult</title>
</head>
<body>
<h1>登録が正常に終了しました</h1>
<h1> <%= user.getPass() %></h1>
<button onclick="location.href='/grigri/TopGuri.jsp'">戻る</button>
</body>
</html>