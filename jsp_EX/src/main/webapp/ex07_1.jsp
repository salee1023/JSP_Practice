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
	<p>���� �������� ex07_1 �������Դϴ�.</p>
	���̵� : <%=id %><br/>
	�н����� : <%=pw %>
</body>
</html>