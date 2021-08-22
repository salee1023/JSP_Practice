<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
[JSP �±� ����] 
	[������(directive)] <%@	%> : ������ �Ӽ�
		page ������
			- info �Ӽ� : �������� �������ִ� ���ڿ� ��> <%@ page info = "copyrights by ~" %>
			- language �Ӽ� : jsp���������� ����� �� ���� ��> <%@ page language="java" %>
			- contentType �Ӽ� : jsp �������� ������ ��� ���·� ����� ���� ���������� �˷��ִ� ���� (charset=euc-kr ����)
			- extends �Ӽ� : jsp�� �������� ��ȯ�ɶ� ��ӹ��� Ŭ������ �����ϴ� �Ӽ� (����� ���� ���� ����.)
			- import �Ӽ� : �ٸ� ��Ű���� �ִ� Ŭ������ ������ ����Ҷ� ��> <%@ page import="java.util.*, java.sql.*" %> <%@ page import="java.io.*%>
				** JSP �������� �ڵ����� �ڵ����� import�ϴ� ��Ű��
					- javax.servlet
					- javax.servlet.jsp
					- javax.servlet.http
			- session �Ӽ� : HttpSession �Ӽ����� ��� ���θ� ���� ��> <%@ page session="false" %>
			- buffer �Ӽ� : JSP �������� ��� ũ�⸦ KB������ �����ϴ� �Ӽ�, �⺻���� 8KB
			- autoFlush �Ӽ� : ���۰� �� á�� ��� �ڵ����� ���۸� ���� �Ӽ�, �⺻���� true
			- isThreadSafe : �������� ��û�� ó���� �� ���θ� ���� (�� ��������ʴ´�.)
			- errorPage�Ӽ� : ����ó���� �� �������� URL ����
			- isErrorPage : ������������ ����ϴ� ���������� ���θ� �����ϴ� �Ӽ�
			- pageEncoding : contentType�� charset�� ����.
				
		include ������: ������ jsp �������� �ٸ� jsp �������� html ������ �ҷ��ͼ� ���� �������� �Ϻη� ����� �� �̿��ϴ� �Ӽ�
					  �ҷ��� ����� file �����̴�. file �Ӽ��� �̿��ؼ� �����Ѵ�. 
					  <%@ include file="b/aaa.jsp" %>
					  
		taglib ������: �׼��� ����� �� �ʿ��� ������
					 - �׼���
					   1. �׼��� ����� �� �⺻������ ����� ���� �ְ�, 
					   2. �׼��� ���� ���̺귯���� ��ġ�ؾ߸� ����� �� �ִ� �͵� �ִ�.
					 taglib �����ڴ� 2�� ��쿡 �ʿ��ϴ�.
					 <%@ taglib prefix="c" uri="http://oracle.com/jsp/jstl/core" %>
					 
	[��ũ���� ���(��ũ��Ʈ��, �ͽ��÷���, �����)]
		��ũ��Ʈ�� : <% %> : �ڹ��ڵ�
		�ͽ������� : <%= %> : ����� ���
		����� : <%! %> : ����, �޼ҵ� ����
	[�ּ�] : <%-- --%> 
	[�׼��±�] : <jsp:action> </jsp:action> : �ڹٺ� ����
	
[JSP�� ���� ��ü]
 ���ΰ�ü : ��ü�� ���������ʰ� �ٷ� ����� �� �ִ� ��ü�� �ǹ�
 JSP���� �����Ǵ� ���ΰ�ü�� JSP �����̳ʿ� ���� Servlet���� ��ȯ�� �� �ڵ����� ��ü�� �����ȴ�.
 
 -- ���ΰ�ü�� ���� --
 ����� ��ü : request - doGet, doPost �޼ҵ��� ù��° �Ķ���Ϳ� ������ ����
 		    response - doGet, doPost �޼ҵ��� �ι�° �Ķ���Ϳ� ������ ����
 		    out - ���������� HTML�ڵ带 ����ϴ� ��� (javax.servlet.jsp.jspWriter)
 ���� ��ü : page - JSP�������κ��� ������ ����
 		    config - JSP �������� ���������� �������� ���
 ���� ��ü : session - ���ǰ� ���õ� ���
 ���� ��ü : exception - ����ó���� ���õ� ���
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>