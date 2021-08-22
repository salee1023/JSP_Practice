package com.test.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ServletContextListener (contextInitialized(), contextDestroy())
// 웹어플리케이션을 감시하는 리스너이다.
// 리스너가 보고있는 어플리케이션이 시작, 종료시에 호출된다.

// 리스너를 제작하고, web.xml에 리스너 클래스를 정의

@WebServlet(name = "CL", urlPatterns = { "/CL" })
public class ContextL_Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContextL_Ex() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("APP Start");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
