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
	request ��ü : �����(Ŭ���̾�Ʈ)�� ��û�� �����ϴ� ��ü
	-- ���� �޼ҵ�
	getContextPath() : �����ø����̼��� context path�� ���� �� ����ϴ� �޼ҵ�
	getMethod() :  get��İ� post����� �����ϱ� ���ؼ� ����ϴ� �޼ҵ�
	getSession() : ���� ��ü�� ���� �� ����ϴ� �޼ҵ�
	getProtocol() : �ش� ���������� ���� �� ����ϴ� �޼ҵ�
	getRequestURL() : ��û�� URL�� ���� �� ����ϴ� �޼ҵ�
	getRequestURI() : ��û�� URI�� ���� �� ����ϴ� �޼ҵ�
	getQueryString() : ������Ʈ�� ���� �� ����ϴ� �żҵ�
 -->
 
 <%
 	out.println("����:"+request.getServerName()+"<br/>");
	out.println("��Ʈ:"+request.getServerPort()+"<br/>");
	out.println("��û���:"+request.getMethod()+"<br/>");
	out.println("��������:"+request.getProtocol()+"<br/>");
	out.println("URL:"+request.getRequestURL()+"<br/>");
	out.println("URI:"+request.getRequestURI()+"<br/>");
 %>
</body>
</html>