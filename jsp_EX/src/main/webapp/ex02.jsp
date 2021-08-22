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

<!--표현식(expression) : 변수의 값이나 메소드의 결과값을 출력할 때 사용한다.
	표현식의 결과값은 String 타입. ;는 사용할 수 없다.
-->
i = <%=i %><br/>
str = <%=str %><br/>
hap = <%=hap(2,10) %><br/>








</body>
</html>