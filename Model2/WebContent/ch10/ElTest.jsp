<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int i=3;
 	out.println("i = "+i);
	request.setAttribute("j", "3");
	
%>
<p>
<%-- i=<%=i>4 %> --%>
 i=<%=i+"4" %>
<p>
i=${j+4 }


</body>
</html>