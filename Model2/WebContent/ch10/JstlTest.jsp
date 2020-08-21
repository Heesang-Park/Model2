<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- if문 사용법 EL을 사용하여 조건문 구현 -->
<c:if test="${4>3 }">
안녕하세요~~<br>
</c:if>
--------------------------------------<p>
 변수선언과 if문<br> 
<c:set var="i" value="4"/>
<%-- <% request.setAttribute("i", 4); %>와 같음 --%>
<c:if test="${i>3 }">
안녕하세요!!4
</c:if>
---------------------------------------<p>
반복문 forEach<br>
<c:forEach begin="1" end="10">
점심 맛있게 드세요!<br>
</c:forEach>
---------------------------------------<p>
1부터 10까지의 합<br>
<c:forEach var="i" begin="1" end="10">
<c:set var="sum1" value="${sum1=sum1+i }"/>
</c:forEach>
sum1 : ${sum1 }<br>
---------------------------------------<p>
1부터 10까지의 합 step활용 <br>
<c:forEach var="j" begin="1" end="10" step="${j=j+2 }">
<c:set var="sum2" value="${sum2=sum2+j }"/>
</c:forEach>
sum1 : ${sum2 }<br>

</body>
</html>