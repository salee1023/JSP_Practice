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
	if (cookies != null ){
		for (int i = 0; i < cookies.length; i++){
			String str = cookies[i].getName();
			if(str.equals("id")){
				out.println("cookies["+i+"] name: "+ cookies[i].getName() + "<br/>");
				out.println("cookies["+i+"] value: "+ cookies[i].getValue() + "<br/>");
			}
		}		
	}
%>
<form method="post" action="ex08_2.jsp">
	<input type="submit" value="쿠키 삭제"/>
</form>
</body>
</html>