<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <!--  prefix : 동일한 이름의 태그가 성격이 다른 여러 태그 라이브러리로 존재하여 충돌이 되므로 이를 구분하기 위한 목적 -->
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>ch10: 태그파일 예제 -PrintTagTest.jsp</h2>
<hr>
<i><mytag:print/></i>
</div>
</body>
</html>