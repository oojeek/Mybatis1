<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>首页</title>
</head>
<body>
<form action="login.do" method="post">
	<input type="hidden" name="method"  value="getPerson"/>
	用户名：<input type="text" name="name"><br>
	密码：<input type="text" name="password"><br>
	年龄：<input type="text" name="age"><br>
	<input type="submit" value="提交">
</form>
</body>
</html>
