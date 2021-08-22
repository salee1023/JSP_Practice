<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%! String id, pw; %>
	<%
		id = request.getParameter("id");
		pw = request.getParameter("pw");
	%>
	<p>현재 페이지는 ex07_1 페이지입니다.</p>
	아이디 : <%=id %><br/>
	패스워드 : <%=pw %>
</body>
</html>