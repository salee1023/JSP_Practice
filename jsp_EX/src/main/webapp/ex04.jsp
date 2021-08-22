<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 
	request 객체의 관련 메소드 (파라미터 메소드)
	getParameter(String name) : name에 해당하는 파라미터의 값을 구할 때 사용
	getParameterNames() : 모든 파라미터의 이름을 얻어올 때 사용
	getParameterValues(String name) : name에 해당하는 파라미터의 값들을 얻어올 때 사용. (반환타입은 배열)
 -->
 
<%!
	String name, id, pw, gender, local;
	String[] hobbys;
%>

<%
	request.setCharacterEncoding("EUC-KR");
	name = request.getParameter("name");
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	gender = request.getParameter("gender");
	local = request.getParameter("local");
	hobbys = request.getParameterValues("hobby");
%>

이름: <%=name %><br/>
아이디: <%=id %><br/>
비밀번호: <%=pw %><br/>
성별: <%=gender %><br/>
취미: <%= Arrays.toString(hobbys) %><br/>
지역: <%=local %><br/>
</body>
</html>