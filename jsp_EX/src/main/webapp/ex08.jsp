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
	String cookieName = "id";
	Cookie cookie = new Cookie(cookieName, "test");
	cookie.setMaxAge(60*30); //30��
	response.addCookie(cookie);
%>
<h2>��Ű�� �����ϴ� ������</h2>
"<%=cookieName %>" ��Ű�� �����Ǿ����ϴ�.<br/>
<form method="post" action="ex08_1.jsp">
	<input type="submit" value="������ ��Ű Ȯ��"/>
</form>
</body>
</html>