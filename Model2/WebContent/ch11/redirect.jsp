<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch11 : redirect</title>
</head>
<body bgcolor="#FFFFFF">
<h3>&lt;c:redirect&gt;</h3>


	<c:redirect url="/ch11/choose.jsp">
		<c:param name="sel">a</c:param>
	</c:redirect>


</body>
</html>