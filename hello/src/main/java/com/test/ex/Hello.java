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
	 * Servlet Ư¡ 
	 * ���� �����ø����̼� ������Ʈ
	 * Ȯ���ڴ� .java
	 * Ŭ���̾�Ʈ�� ��û�� �������� �۵��Ѵ�. 
	 * java thread�� �̿��ؼ� �����Ѵ�. (��Ƽ�������̴�. ������ ���ϸ� �ٿ��ش�.)
	 * MVC ���Ͽ��� controller�� �̿�ȴ�.
	 */   
	
	/*
	 * URL ���� (mapping)
	 * ������ ��� : http://localhost:8080/hello/servlet/com.test.ex.Hello
	 * URL ���� ��� : http://localhost:8080/hello/He
	 * ���� ��� : web.xml���� ���� ������ �ϴ� ����� ������̼�[@WebServlet("/He")] �̿��ϴ� ����� �ִ�.
	 * URL ������ �̿��ϸ� ���Ȼ� ������� ������ �� �ִ�.(���ø����̼��� ���丮 ��θ� ����� ����.)
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
