<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<% request.setCharacterEncoding("UTF-8"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h2>회원가입</h2>
	<form name=joinform action="MProc2" method="post">
	<table border=1 cellspacing="0" cellpadding="5" width="400">
		<tr height="40">
			<td width="150" align="center">아이디</td>
			<td width="250"><input type="text"  name="id"></td>
		</tr>
		<tr height="40">
			<td width="150" align="center">패스워드</td>
			<td width="250"><input type="password"  name="pass"></td>
		</tr>
		<tr height="40">
			<td width="150" align="center">이름</td>
			<td width="250"><input type="text"  name="name"></td>
		</tr>
		<tr height="40">
			<td width="150" align="center">전화</td>
			<td width="250"><input type="text"  name="phone"></td>
		</tr>
		<tr height="40">
			<td width="150" align="center">이메일</td>
			<td width="250"><input type="text" size=20 name="email"></td>
		</tr>
			<tr height="40">
			<td width="600" colspan="2" align="center">
			<input type="submit" value="회원가입">			
			
			</td>
		</tr>
</table>		
</form>
</center>
</body>
</html>