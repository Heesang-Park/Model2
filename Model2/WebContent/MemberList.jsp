<%@page import="java.net.URLEncoder"%>

<%@page import="java.util.Vector"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<center>
<h2>전체 회원 보기</h2>

<table width="600" border="1">
	<tr height="40">
		<td width="120" align="center">아이디</td>
		<td width="120" align="center">이메일</td>
		<td width="120" align="center">전화번호</td>
		<td width="120" align="center">취미</td>
		<td width="120" align="center">직업</td>
	</tr>
	<%-- model1 방식 <%
		for(int i=0; i<v.size(); i++){
			MemberDBBean bean = v.get(i); // 박스에서 데이터를 꺼내서 화면에 출력하기 위해 저장
		
	%> --%>
	<!-- model2 -->
	<c:forEach var="bean" items="${vec }"> <!-- 확장 for문 -->
		
	<tr height="40">
		<%-- <td width="120" align="center"><%=bean.getId() %></td> --%>
		<!-- id를 누르면 상세페이지로 넘어가는 것-->
		<td width="120" align="center">${ bean.id}</td>
		<td width="120" align="center">
		  <a href="MemberInfo.jsp?email=${bean.email }">${bean.email}</a></td>
		<td width="120" align="center">${ bean.phone}</td>
		<td width="120" align="center">${ bean.hobby}</td>
		<td width="120" align="center">${ bean.job}</td>
	</tr>
	</c:forEach>

</table>
</center>
</body>
</html>