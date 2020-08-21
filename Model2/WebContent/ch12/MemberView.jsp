<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<%request.setCharacterEncoding("UTF-8"); %>
<html>
<head>
<title>확인</title>
</head>
<body>
<center>
	<h2>회원가입 완료</h2>
	 <table border=1 cellspacing="0" cellpadding="5" width="400">
		<tr height="40">
			<td width="150" align="center">아이디</td>
			<td width="250">${bean.id }</td>
		</tr>
		<tr height="40">
			<td width="150" align="center">패스워드</td>
			<td width="250">${bean.pass }</td>
		</tr>
		<tr height="40">
			<td width="150" align="center">이름</td>
			<td width="250">${bean.name }</td>
		</tr>
		<tr height="40">
			<td width="150" align="center">전화</td>
			<td width="250">${bean.phone }</td>
		</tr>
		<tr height="40">
			<td width="150" align="center">이메일</td>
			<td width="250">${bean.email }</td>
		</tr>
	</table>
</center>
</body>
</html>