<%@tag import="Model2.ch10.Product" %>
<%@ tag body-content="scriptless" pageEncoding="UTF-8"%>
<!-- 애트리부트 선언하기 -->
<%@ attribute name="bgcolor" %>
<%@ attribute name="border" %>

<jsp:useBean id="product" class="Model2.ch10.Product"/>

<h2><jsp:doBody/></h2>
<table border="${border }" bgcolor="${bgcolor }" width="150">
	<%
		for(String item:product.getProductList()){
			out.println("<tr><td>" +item+"</td></tr>");
		}
	
	%>
	
	
</table>
