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
<%--
	int i = 0;
	while(true) {
		i++;
		out.println("5 *"+i+"="+5*i+"<br/>");
--%>
   ----<br/>
<%--
	if(i >= 9) break;
   }
--%>
-->

<%!
	int i = 100;
	String str = "test";
%>
<%!
	public int hap(int a, int b) {
		return a+b;
	}
%>

<%--
	out.println("i= "+i+"<br/>");
	out.println("str= "+str+"<br/>");
	out.println("hap= "+hap(2,10)+"<br/>");
--%>

<!--ǥ����(expression) : ������ ���̳� �޼ҵ��� ������� ����� �� ����Ѵ�.
	ǥ������ ������� String Ÿ��. ;�� ����� �� ����.
-->
i = <%=i %><br/>
str = <%=str %><br/>
hap = <%=hap(2,10) %><br/>








</body>
</html>