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
	response 객체 메소드
	getCharacterEncoding() : 응답할 때 어떤 문자 인코딩을 사용할 것인지 지정할 때.
	addCookie(Cookie) : 쿠키를 지정할 때.
	sendRedirect(URL) : 이동하고자 하는 URL을 지정할 때.
 -->

<%! int age; %>
<%
	String str = request.getParameter("age");
	age = Integer.parseInt(str);
	
	if (age >= 19) {
		response.sendRedirect("a.jsp?age="+age);
	}else{
		response.sendRedirect("b.jsp?age="+age);
	}
%>
나이 : <%=age %>
</body>
</html>