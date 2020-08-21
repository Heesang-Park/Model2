<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch11 : choose</title>
</head>
<body bgcolor="#FFFFFF">
<h3>&lt;c:choose&gt;</h3>
	<form>
		<select name="sel">
			<option>-</option>
			<option ${param.sel=='a'? 'selected' : ''}>a</option>
			<option ${param.sel=='b'? 'selected' : ''}>b</option>
			<option ${param.sel=='c'? 'selected' : ''}>c</option>
			<option ${param.sel=='d'? 'selected' : ''}>d</option>
			
		<input type=submit value="선택">
		</select>
	</form>	
<hr>
	<form>	
		<c:choose>
			<c:when test="${param.sel=='a' }">a를 선택</c:when>
			<c:when test="${param.sel=='b' }">b를 선택</c:when>
			<c:when test="${param.sel=='c' }">c를 선택</c:when>
			<c:otherwise>
				a,b,c 이외의 것을 선택
			</c:otherwise>
		</c:choose>		
	</form>
</body>
</html>