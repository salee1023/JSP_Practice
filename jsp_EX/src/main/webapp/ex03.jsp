<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 
	request 객체 : 사용자(클라이언트)의 요청을 관리하는 객체
	-- 관련 메소드
	getContextPath() : 웹어플리케이션의 context path를 얻어올 때 사용하는 메소드
	getMethod() :  get방식과 post방식을 구분하기 위해서 사용하는 메소드
	getSession() : 세션 객체를 얻을 때 사용하는 메소드
	getProtocol() : 해당 프로토콜을 얻어올 때 사용하는 메소드
	getRequestURL() : 요청한 URL을 얻어올 때 사용하는 메소드
	getRequestURI() : 요청한 URI를 얻어올 때 사용하는 메소드
	getQueryString() : 쿼리스트링 얻어올 때 사용하는 매소드
 -->
 
 <%
 	out.println("서버:"+request.getServerName()+"<br/>");
	out.println("포트:"+request.getServerPort()+"<br/>");
	out.println("요청방식:"+request.getMethod()+"<br/>");
	out.println("프로토콜:"+request.getProtocol()+"<br/>");
	out.println("URL:"+request.getRequestURL()+"<br/>");
	out.println("URI:"+request.getRequestURI()+"<br/>");
 %>
</body>
</html>