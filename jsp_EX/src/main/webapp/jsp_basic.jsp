<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
[JSP 태그 종류] 
	[지시자(directive)] <%@	%> : 페이지 속성
		page 지시자
			- info 속성 : 페이지를 설명해주는 문자열 예> <%@ page info = "copyrights by ~" %>
			- language 속성 : jsp페이지에서 사용할 언어를 지정 예> <%@ page language="java" %>
			- contentType 속성 : jsp 페이지의 내용을 어떠한 형태로 출력할 지를 브라우저에게 알려주는 역할 (charset=euc-kr 포함)
			- extends 속성 : jsp가 서블릿으로 변환될때 상속받을 클래스를 지정하는 속성 (사용할 일이 거의 없다.)
			- import 속성 : 다른 패키지에 있는 클래스를 가져다 사용할때 예> <%@ page import="java.util.*, java.sql.*" %> <%@ page import="java.io.*%>
				** JSP 페이지가 자동으로 자동으로 import하는 패키지
					- javax.servlet
					- javax.servlet.jsp
					- javax.servlet.http
			- session 속성 : HttpSession 속서으이 사용 여부를 지정 예> <%@ page session="false" %>
			- buffer 속성 : JSP 페이지의 출력 크기를 KB단위로 지정하는 속성, 기본값은 8KB
			- autoFlush 속성 : 버퍼가 다 찼을 경우 자동으로 버퍼를 비우는 속성, 기본값은 true
			- isThreadSafe : 여러개의 요청을 처리할 지 여부를 결정 (잘 사용하지않는다.)
			- errorPage속성 : 예외처리를 할 페이지의 URL 지정
			- isErrorPage : 에러페이지를 담당하는 페이지인지 여부를 지정하는 속성
			- pageEncoding : contentType의 charset과 같다.
				
		include 지시자: 현재의 jsp 페이지에 다른 jsp 페이지나 html 문서를 불러와서 현재 페이지의 일부로 사용할 때 이용하는 속성
					  불러올 대상은 file 형태이다. file 속성을 이용해서 지정한다. 
					  <%@ include file="b/aaa.jsp" %>
					  
		taglib 지시자: 액션을 사용할 때 필요한 지시자
					 - 액션은
					   1. 액션을 사용할 때 기본적으로 사용할 수도 있고, 
					   2. 액션이 속한 라이브러리를 설치해야만 사용할 수 있는 것도 있다.
					 taglib 지시자는 2의 경우에 필요하다.
					 <%@ taglib prefix="c" uri="http://oracle.com/jsp/jstl/core" %>
					 
	[스크립팅 요소(스크립트릿, 익스플레션, 선언부)]
		스크립트릿 : <% %> : 자바코드
		익스프레션 : <%= %> : 결과값 출력
		선언부 : <%! %> : 변수, 메소드 선언
	[주석] : <%-- --%> 
	[액션태그] : <jsp:action> </jsp:action> : 자바빈 연결
	
[JSP의 내부 객체]
 내부객체 : 객체를 생성하지않고 바로 사용할 수 있는 객체를 의미
 JSP에서 제공되는 내부객체는 JSP 컨테이너에 의해 Servlet으로 변환될 때 자동으로 객체가 생성된다.
 
 -- 내부객체의 종류 --
 입출력 객체 : request - doGet, doPost 메소드의 첫번째 파라미터와 동일한 역할
 		    response - doGet, doPost 메소드의 두번째 파라미터와 동일한 역할
 		    out - 웹브라우저로 HTML코드를 출력하는 기능 (javax.servlet.jsp.jspWriter)
 서블릿 객체 : page - JSP페이지로부터 생성된 서블릿
 		    config - JSP 페이지의 구성정보를 가져오는 기능
 세션 객체 : session - 세션과 관련된 기능
 예외 객체 : exception - 예외처리와 관련된 기능
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