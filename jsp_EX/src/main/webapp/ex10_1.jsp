<%@page import="java.util.Enumeration"%>
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
	out.println("-------------getAttribute() 메소드 사용 결과------------<br/>");
	Object idObj = session.getAttribute("id");
	String id = (String)idObj;
	out.println(id +"<br/>");
	
	Object pwObj = session.getAttribute("pw");
	String pw = (String)pwObj;
	out.println(pw +"<br/>");
	
	out.println("-------------getAttributeNames() 메소드 사용 결과------------<br/>");
	String sName, sValue;
	Enumeration enumeration = session.getAttributeNames();
	while(enumeration.hasMoreElements()){
		sName = enumeration.nextElement().toString();
		sValue = session.getAttribute(sName).toString();
		out.println("세션네임: "+ sName + "<br/>");
		out.println("세션값: "+ sValue + "<br/>");
	}
	
	out.println("-------------getId() 메소드 사용 결과------------<br/>");
	String sID = session.getId();
	out.println("세션 ID : "+sID +"<br/>");
	int sInterval = session.getMaxInactiveInterval();
	out.println("세션 유효시간 : "+sInterval +"<br/>");
	
	out.println("-------------removeAttribute() 메소드 사용 결과------------<br/>");
	session.removeAttribute("id");
	Enumeration enumeration_1 = session.getAttributeNames();
	while(enumeration_1.hasMoreElements()){
		sName = enumeration_1.nextElement().toString();
		sValue = session.getAttribute(sName).toString();
		out.println("세션네임: "+ sName + "<br/>");
		out.println("세션값: "+ sValue + "<br/>");
	}
	
	out.println("-------------invalidate() 메소드 사용 결과------------<br/>");
	session.invalidate();
	if(request.isRequestedSessionIdValid()){
		out.println("유효한 세션이 있습니다.");
	}else{
		out.println("유효한 세션이 없습니다.");
	}
%>
</body>
</html>