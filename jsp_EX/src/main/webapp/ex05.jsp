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
	response ��ü �޼ҵ�
	getCharacterEncoding() : ������ �� � ���� ���ڵ��� ����� ������ ������ ��.
	addCookie(Cookie) : ��Ű�� ������ ��.
	sendRedirect(URL) : �̵��ϰ��� �ϴ� URL�� ������ ��.
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
���� : <%=age %>
</body>
</html>