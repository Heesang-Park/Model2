<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>

<%
	// 데이터베이스 연결관련 변수 선언
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	Context initContext = new InitialContext();
	Context envContext = (Context)initContext.lookup("java:/comp/env");
	DataSource ds = (DataSource)envContext.lookup("jdbc/orcl");
	
	// 커넥션 얻기
	conn=ds.getConnection();
	out.println("오라클 연결 성공!!");


%>
    
    
    
    
    
    
    