package com.test.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ServletContext�� �̿��� ������ ����

// �������� Servlet���� �����͸� �����ؾ� �� ��쿡 context parameter�� ����Ѵ�.
// web.xml ���Ͽ� �����͸� �ۼ��ϸ�, Servlet���� ������ �� �ִ�.

// ����
// Servlet Ŭ���� ����
// web.xml���Ͽ� context parameter ���
// ServletContext �޼ҵ带 �̿��ؼ� �����͸� ����Ѵ�.
// getServletContext() : ServletContext�� �ҷ��´�.

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
