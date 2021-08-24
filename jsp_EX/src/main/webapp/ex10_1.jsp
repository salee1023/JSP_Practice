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
	out.println("-------------getAttribute() �޼ҵ� ��� ���------------<br/>");
	Object idObj = session.getAttribute("id");
	String id = (String)idObj;
	out.println(id +"<br/>");
	
	Object pwObj = session.getAttribute("pw");
	String pw = (String)pwObj;
	out.println(pw +"<br/>");
	
	out.println("-------------getAttributeNames() �޼ҵ� ��� ���------------<br/>");
	String sName, sValue;
	Enumeration enumeration = session.getAttributeNames();
	while(enumeration.hasMoreElements()){
		sName = enumeration.nextElement().toString();
		sValue = session.getAttribute(sName).toString();
		out.println("���ǳ���: "+ sName + "<br/>");
		out.println("���ǰ�: "+ sValue + "<br/>");
	}
	
	out.println("-------------getId() �޼ҵ� ��� ���------------<br/>");
	String sID = session.getId();
	out.println("���� ID : "+sID +"<br/>");
	int sInterval = session.getMaxInactiveInterval();
	out.println("���� ��ȿ�ð� : "+sInterval +"<br/>");
	
	out.println("-------------removeAttribute() �޼ҵ� ��� ���------------<br/>");
	session.removeAttribute("id");
	Enumeration enumeration_1 = session.getAttributeNames();
	while(enumeration_1.hasMoreElements()){
		sName = enumeration_1.nextElement().toString();
		sValue = session.getAttribute(sName).toString();
		out.println("���ǳ���: "+ sName + "<br/>");
		out.println("���ǰ�: "+ sValue + "<br/>");
	}
	
	out.println("-------------invalidate() �޼ҵ� ��� ���------------<br/>");
	session.invalidate();
	if(request.isRequestedSessionIdValid()){
		out.println("��ȿ�� ������ �ֽ��ϴ�.");
	}else{
		out.println("��ȿ�� ������ �����ϴ�.");
	}
%>
</body>
</html>