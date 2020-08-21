<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>

<table width="800" border="1" align="center">
<c:forEach var="i" begin="1" end="9">
	<tr height="40">	
	  <c:forEach var="j" begin="2" end="9">
		 <td align="center" >
		 ${j } x ${i } = ${j*i } &nbsp;&nbsp;
		 </td>
	  </c:forEach>
	</tr>		
</c:forEach>
</table>


</body>
</html>