package com.test.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ServletContext를 이용한 데이터 공유

// 여러개의 Servlet에서 데이터를 공유해야 할 경우에 context parameter를 사용한다.
// web.xml 파일에 데이터를 작성하면, Servlet에서 공유할 수 있다.

// 순서
// Servlet 클래스 제작
// web.xml파일에 context parameter 기술
// ServletContext 메소드를 이용해서 데이터를 사용한다.
// getServletContext() : ServletContext를 불러온다.

@WebServlet(name = "SCEx", urlPatterns = { "/SCEx" })
public class ServletContext_EX extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletContext_EX() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("password");
		String local = getServletContext().getInitParameter("local");
		
		//response.setContentType("text/html; Charset=euc-kr");
		//PrintWriter out = response.getWriter();
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(local);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
