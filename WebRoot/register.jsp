<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body align="center">
	<h2>欢迎注册！</h2>
	<form action="register.action" method="post">
		<input type="text" name="username" placeholder="用户名"><br>
		<input type="password" name="password" placeholder="密码"><br>
		<input type="email" name="email" placeholder="邮箱"><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>