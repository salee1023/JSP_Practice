package com.test.ex;

import java.io.IOException;
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
 * 	. doGet 또는 doPost 메소드안데 클라이언트의 요청이 왔을 때 처리해야 할 일들을 기술
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
 */
@WebServlet("/Sev01")
public class Servlet_Demo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet_Demo01() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
