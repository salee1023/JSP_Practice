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

// ���ؽ�Ʈ �н�(Context Path)

// WAS(Web Application Server)���� �����ø����̼��� �����ϱ� ���� path�� ���Ѵ�.
// ��Ŭ�������� ������Ʈ�� �����Ҷ����� �ڵ����� server.xml�� �Է��� �Ѵ�.

// ���� �ʱ�ȭ : ServletConfig Ŭ����

// Ư�� Servlet�� �����ɶ� �ʱ⿡ �ʿ��� ������(���̵� ����, Ư�����)���� �ʱ�ȭ�ϴ� ���� ���� �ʱ�ȭ��� �Ѵ�. 
// 1. �ʱ�ȭ �Ķ����(������ ������ �� �ʿ��� ������)�� web.xml�� ����Ѵ�.
//	  ServletConfig Ŭ������ �̿��ؼ� �ʱ�ȭ �Ķ���� ����� �����ϴ�.
// 2. �ʱ�ȭ �Ķ���͸� Servlet ���Ͽ� ���� ����ϴ� ����� �ִ�.

// web.xml�� �ʱ�ȭ �Ķ���� ����ϱ�
// Servlet Ŭ���� �ۼ�
//    |
// web.xml�� �ʱ�ȭ �Ķ���͸� �Է�
//    |
// ServletConfig�� �޼ҵ带 �̿��ؼ� �����͸� ���(����)�Ѵ�.
// ServletConfig�� getInitParameter() �޼ҵ带 �̿��ؼ� ������ �� �ִ�.

// Servlet ���Ͽ� �ʱ�ȭ �Ķ���͸� ���� ����ϱ�
// Servlet Ŭ���� �ۼ�
//    |
// @WebInitParam �� �ʱ�ȭ �Ķ���͸� �ۼ�
//    |
// ServletConfig �޼ҵ带 �̿��Ѵ�.

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
		
		// html �������� ���
		// out.println("<html><head></head><body>...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
