package com.test.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 컨텍스트 패스(Context Path)

// WAS(Web Application Server)에서 웹어플리케이션을 구분하기 위한 path를 말한다.
// 이클립스에서 프로젝트를 생성할때마다 자동으로 server.xml에 입력을 한다.

// 서블릿 초기화 : ServletConfig 클래스

// 특정 Servlet이 생성될때 초기에 필요한 데이터(아이디 정보, 특정경로)들을 초기화하는 것을 서블릿 초기화라고 한다. 
// 1. 초기화 파라미터(서블릿이 생성될 때 필요한 데이터)는 web.xml에 기술한다.
//	  ServletConfig 클래스를 이용해서 초기화 파라미터 사용이 가능하다.
// 2. 초기화 파라미터를 Servlet 파일에 직접 기술하는 방법도 있다.

// web.xml에 초기화 파라미터 기술하기
// Servlet 클래스 작성
//    |
// web.xml에 초기화 파라미터를 입력
//    |
// ServletConfig의 메소드를 이용해서 데이터를 사용(접근)한다.
// ServletConfig의 getInitParameter() 메소드를 이용해서 접근할 수 있다.

// Servlet 파일에 초기화 파라미터를 직접 기술하기
// Servlet 클래스 작성
//    |
// @WebInitParam 에 초기화 파라미터를 작성
//    |
// ServletConfig 메소드를 이용한다.

@WebServlet(urlPatterns = {"/InitS"}, initParams= {@WebInitParam(name="id", value="test11"),@WebInitParam(name="pw", value="1000"),@WebInitParam(name="local", value="busan") })
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		String local = getInitParameter("local");
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(local);
		
		//response.setContentType("text/html; charset=euc-kr");
		//PrintWriter out = response.getWriter();
		
		// html 형식으로 출력
		// out.println("<html><head></head><body>...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
