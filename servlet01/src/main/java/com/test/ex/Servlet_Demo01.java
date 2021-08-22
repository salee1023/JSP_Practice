package com.test.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet이란?
 * Servlet interface를 implements하여 생성한 자바 클래스
 * 서블릿은 서블릿 엔진에 의해 동작을 하며 여러 사용자에 의해 호출 될 수 있다.
 * 서블릿의 인스턴스는 재활용 가능하다.
 * 서블릿 작성 규칙
 * 	. 서블릿 javax.servlet.http.HttpServlet 클래스를 상속해야한다.
 * 	. doGet 또는 doPost 메소드안에 클라이언트의 요청이 왔을 때 처리해야 할 일들을 기술
 * 	. HTML 문서를 출력하는데 있어서, doGet이나 doPost 메소드의 2번째 인자를 이용한다.
 * 
 * HttpServletRequest : 사용자의 정보를 서블릿 엔진에 전달하는 객체
 * 	. 파라미터의 이름과 값
 *  . 요청받는 서버의 이름
 *  . input type의 데이터
 *  . 메소드 : getParameterValues(), getParameter(), getRemoteHost(), getServerName()
 *  
 * HttpServletResponse : 서버에서 만든 응답을 암호화해서 사용자에게 전달하는 객체
 * 	. 응답으로 사용되는 content의 길이
 * 	. 응답으로 사용되는 content의 타입, 화면에 출력해야 할 모든 값
 * 	. 메소드 : setContentType(String type), setContentLength(int length), getWriter()
 * 
 * doGet 메소드 호출 : html form 태그에서 method=get일 때 호출, URL 주소창에 servlet url을 입력했을 때도 호출.
 * 
 * doPost 메소드 호출 : html form 태그에서 method=post일 때 호출.
 * 
 * throws 절에 있는 ServletException과 IOException은 생략이 가능, 다른 exception을 추가 할 수 없음.
 */

/** 서블릿의 동작 순서
 * 
 * 웹브라우저 --> 웹서버 --> 웹어플리케이션 서버 --> 서블릿 컨테이너
 * 										   .스레드 생성
 * 										   .servlet 객체 생성
 * 
 * Servlet 기술 : CGI를 대신할 수 있는 Java 기술 (기존의 CGI의 차이점)
 * 
 * 	1) CGI> 로딩과 초기화 작업을 진행하기 때문에 서버에 대한 오버헤드가 크다.
 *	   서블릿> 한번 메모리에 로딩되어 수행되면 작업이 모두 수행되어 끝나더라 메모리에서 해제 되지 않는다(재활용)
 *			 계속적인 수행 요청이 들어와도 메모리 로딩이나 초기화를 처리하지 않는다.
 *			 모든 서블릿은 한번만 메모리에 로딩 되어진다.
 *	2) 특정 웹서버에 비의존적이다. 
 *	   Java 언어로 구현되는 프로그램이기 때문에 플랫폼(운영체제)과는 무관한 실행 파일을 만들 수 있다.
 *	   기존의 CGI는 성능향상을 위해서 추가적인 API가 필요했던 것에 비해, 서블릿은 Servlet API를 활용해서 개발하면 된다. 즉, Servlet 엔진만 활용해도 된다.
 *
 *  3) 서블릿은 멀티스레드로 동작한다.
 *     Servlet은 CGI처럼 웹브라우저에서 요청하는 각각의 프로세스를 생성하지 않는다.
 *     각 요청에 대해서 스레드로 동작한다.
 *
 * 	Servlet 생명주기 (lifecycle)
 * 	Servlet 객체생성 --> init() 호출 --> service(), doGet(), doPost() 호출 --> destroy() 호출
 * 		최초 한번			최초 한번                 요청 시 매번                    마지막 한번
 */
@WebServlet("/Sev01")
public class Servlet_Demo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet_Demo01() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int sum = 0;
		//for (int cnt = 1; cnt <= 100; cnt++) {
		//	sum += cnt;
		//}
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter(); // 웹브라우저에 출력할 스트림을 얻어오는 과정
		
		out.println("<html>");
		out.println("<head>");
		//out.println("<title>100까지 합</title>");
		out.println("<title>doget 메소드 호출</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("get방식입니다. doGet메소드 호출 되었습니다!");
		//out.printf("100까지 합 결과 : %d", sum);
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter(); // 웹브라우저에 출력할 스트림을 얻어오는 과정
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>dopost 메소드 호출</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("post방식입니다. doPost메소드 호출 되었습니다!");
		out.println("</body>");
		out.println("</html>");
	}
}
