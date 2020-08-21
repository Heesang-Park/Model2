<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="bb" class="Model2.ch12.Bank1Bean" scope="page"/>
<jsp:useBean id="bb2" class="Model2.ch12.Bank2Bean" scope="page"/>
<%
	if(request.getMethod().equals("POST")){
		if(bb.transfer(Integer.parseInt(request.getParameter("bal")))){
			out.println("<script>alert('정상처리 되었습니다.')</script>");
		}
		else{
			out.println("<script>alert('이체를 실패했습니다.')</script>");
		}
	}
	bb.getData();
	bb2.getData();
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch12 : 트랜잭션 테스트</title>
</head>
<body>
	<div align="center">
		<h3>계좌현황</h3>
		<hr>
		<table border="1" cellpadding="5" cellspacing="0">
			<tr>
				<td>Bank1</td>
				<td>이름: <%=bb.getAname() %></td>
				<td>잔액: <%=bb.getBalance() %></td>
			</tr>
			<tr>
				<td>Bank2</td>
				<td>이름: <%=bb2.getAname() %></td>
				<td>잔액: <%=bb2.getBalance() %></td>
			</tr>
	
		</table>
		<hr>
		
		<form action="" name="fome1" method="post">
			이체금액 : <input type="text" name="bal" width=200 size=5>
			<input type="submit" value="이체실행" name="B1">
			<input type="reset" value="다시입력" name="B2">
		</form>
	</div>
</body>
</html>