<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch11 : catch</title>
</head>
<body bgcolor="#FFFFFF">
<h3>&lt;c:catch&gt;</h3>

	<c:catch var="errMsg">
	<%=8/0 %>
	</c:catch>
	
	
	error message: ${errMsg}
</body>
</html>