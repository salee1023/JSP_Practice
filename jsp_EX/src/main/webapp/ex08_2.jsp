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
	Cookie[] cookies = request.getCookies();
	for (int i = 0; i < cookies.length; i++) {
		String str = cookies[i].getName();
		if(str.equals("id")){
			out.println("name:"+ cookies[i].getName()+"<br/>");
			cookies[i].setMaxAge(0); //����
			response.addCookie(cookies[i]); //ž��
		}
	}
%>
<form method="post" action="ex08_3.jsp">
	<input type="submit" value="��Ű Ȯ��"/>
</form>
</body>
</html>