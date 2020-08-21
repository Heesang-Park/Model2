<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입 form</title>
</head>
<body>
  
<center>
	<h2>회원가입</h2>
	<form name=member1 action="proc.do" method="post">
	<table border=1 cellspacing="1" cellpadding="10" width="400">
		<tr height="40">
			<td width="300">아이디</td>
			<td><input type="text" size=20 name="id"></td>
		</tr>
		<tr height="40">
			<td width="300">패스워드</td>
			<td><input type="password" size=20 name="pass1"></td>
		</tr>
		<tr height="40">
			<td width="300">패스워드 확인</td>
			<td><input type="password" size=20 name="pass2"></td>
		</tr>
		<tr height="40">
			<td width="300">이메일</td>
			<td><input type="text" size=20 name="email"></td>
		</tr>
		<tr height="40">
			<td width="300">성별</td>
			<td>
			<input type="radio" name="gender" value="남">남	
			<input type="radio" name="gender" value="여">여
			</td>	
		</tr>
		<tr height="40">
			<td width="300">주소</td>
			<td><input type="text" size=20 name="address"></td>
		</tr>
		<tr>
			<td width="300">전화번호</td>
			<td><input type="text" size=20 name="phone"></td>
		</tr>
		<tr height="40">
			<td width="300">당신의 관심분야</td>
			<td>
			<input type="checkbox" name="hobby" value="여행">여행 &nbsp;&nbsp;
			<input type="checkbox" name="hobby" value="등산">등산 &nbsp;&nbsp;
			<input type="checkbox" name="hobby" value="음악">음악 &nbsp;&nbsp;
			<input type="checkbox" name="hobby" value="독서">독서 &nbsp;&nbsp;
			</td>
		</tr>
		<tr height="40">
			<td width="300">당신의 직업은</td>
			<td>
				<select name="job">
					<option selected>교사</option>
					<option>회사원</option>
					<option>유튜버</option>
					<option>요리사</option>
				</select>
			</td>
		</tr>
		<tr height="40">
			<td width="300">당신의 연령은</td>
			<td>
			<input type="radio" name="age" value="10대">10대	&nbsp;&nbsp;		
			<input type="radio" name="age" value="20대">20대	&nbsp;&nbsp;		
			<input type="radio" name="age" value="30대">30대	&nbsp;&nbsp;		
			<input type="radio" name="age" value="40대">40대	&nbsp;&nbsp;	
			</td>
		</tr>
		<tr height="40">
			<td width="300" align="center">하고싶은 말</td>
			<td width="400" align="left">
			<textarea rows="5" cols="30" name="info"></textarea>
			</td>
		</tr>
		<tr height="40">
			<td width="600" colspan="2" align="center">
			<input type="submit" value="회원가입">			
			<input type="button" value="취소">
			</td>
		</tr>				
				
	</table>
	</form>
</center>
</body>
</html>