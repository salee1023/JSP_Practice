<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	session.setAttribute("id", id);
	session.setAttribute("pw", pw);
%>
id�� password ���� �Ӽ� ���� �Ϸ� <br/>

<script>
location.href="ex10_1.jsp";
</script>

</body>
</html>