<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 
	request ��ü�� ���� �޼ҵ� (�Ķ���� �޼ҵ�)
	getParameter(String name) : name�� �ش��ϴ� �Ķ������ ���� ���� �� ���
	getParameterNames() : ��� �Ķ������ �̸��� ���� �� ���
	getParameterValues(String name) : name�� �ش��ϴ� �Ķ������ ������ ���� �� ���. (��ȯŸ���� �迭)
 -->
 
<%!
	String name, id, pw, gender, local;
	String[] hobbys;
%>

<%
	request.setCharacterEncoding("EUC-KR");
	name = request.getParameter("name");
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	gender = request.getParameter("gender");
	local = request.getParameter("local");
	hobbys = request.getParameterValues("hobby");
%>

�̸�: <%=name %><br/>
���̵�: <%=id %><br/>
��й�ȣ: <%=pw %><br/>
����: <%=gender %><br/>
���: <%= Arrays.toString(hobbys) %><br/>
����: <%=local %><br/>
</body>
</html>