<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Guri</title>
</head>
<body>
<h1>GuriRoomへ登録</h1>
<form action="/grigri/Regist" method="post">
ユーザ名：<input type="text" name="regName" required><br>
パスワード：<input type="password" name="regPass" required><br>
<input type="submit" value="登録">
<input type="button" value="戻る" onClick="history.back()">
</form>

</body>
</html>