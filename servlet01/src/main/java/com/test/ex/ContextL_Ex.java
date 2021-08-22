package com.test.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ServletContextListener (contextInitialized(), contextDestroy())
// �����ø����̼��� �����ϴ� �������̴�.
// �����ʰ� �����ִ� ���ø����̼��� ����, ����ÿ� ȣ��ȴ�.

// �����ʸ� �����ϰ�, web.xml�� ������ Ŭ������ ����

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
