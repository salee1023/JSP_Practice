package com.test.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet�̶�?
 * Servlet interface�� implements�Ͽ� ������ �ڹ� Ŭ����
 * ������ ���� ������ ���� ������ �ϸ� ���� ����ڿ� ���� ȣ�� �� �� �ִ�.
 * ������ �ν��Ͻ��� ��Ȱ�� �����ϴ�.
 * ���� �ۼ� ��Ģ
 * 	. ���� javax.servlet.http.HttpServlet Ŭ������ ����ؾ��Ѵ�.
 * 	. doGet �Ǵ� doPost �޼ҵ�ȵ� Ŭ���̾�Ʈ�� ��û�� ���� �� ó���ؾ� �� �ϵ��� ���
 * 	. HTML ������ ����ϴµ� �־, doGet�̳� doPost �޼ҵ��� 2��° ���ڸ� �̿��Ѵ�.
 * 
 * HttpServletRequest : ������� ������ ���� ������ �����ϴ� ��ü
 * 	. �Ķ������ �̸��� ��
 *  . ��û�޴� ������ �̸�
 *  . input type�� ������
 *  . �޼ҵ� : getParameterValues(), getParameter(), getRemoteHost(), getServerName()
 *  
 * HttpServletResponse : �������� ���� ������ ��ȣȭ�ؼ� ����ڿ��� �����ϴ� ��ü
 * 	. �������� ���Ǵ� content�� ����
 * 	. �������� ���Ǵ� content�� Ÿ��, ȭ�鿡 ����ؾ� �� ��� ��
 * 	. �޼ҵ� : setContentType(String type), setContentLength(int length), getWriter()
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
