package com.test.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/He")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*
	 * Servlet 특징 
	 * 동적 웹어플리케이션 컴포넌트
	 * 확장자는 .java
	 * 클라이언트의 요청에 동적으로 작동한다. 
	 * java thread를 이용해서 동작한다. (멀티스레드이다. 서버의 부하를 줄여준다.)
	 * MVC 패턴에서 controller로 이용된다.
	 */   
	
	/*
	 * URL 맵핑 (mapping)
	 * 기존의 경로 : http://localhost:8080/hello/servlet/com.test.ex.Hello
	 * URL 맴핑 경로 : http://localhost:8080/hello/He
	 * 맵핑 방법 : web.xml에서 서블릿 맵핑을 하는 방법과 어노테이션[@WebServlet("/He")] 이용하는 방법이 있다.
	 * URL 맵핑을 이용하면 보안상 취약점을 보완할 수 있다.(어플리케이션의 디렉토리 경로를 숨기기 때문.)
	 */ 
	
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello Servelt!!");		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
