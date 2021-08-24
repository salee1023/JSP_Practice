<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
	String id, pw;
%>
<%
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	
	// DB에 회원이 가입이 되었다고 가정하고 쿠키를 이용해서 회원인증하는 방법
	if (id.equals("test") && pw.equals("1234")){
		Cookie cookie = new Cookie("id", id);
		cookie.setMaxAge(60*2);
		response.addCookie(cookie);
		response.sendRedirect("ex09_1.jsp");
	}else{
		response.sendRedirect("login.html");
	}
%>
</body>
</html>