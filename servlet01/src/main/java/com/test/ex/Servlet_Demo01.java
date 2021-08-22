package com.test.ex;

import java.io.IOException;
import java.io.PrintWriter;

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
 * 	. doGet �Ǵ� doPost �޼ҵ�ȿ� Ŭ���̾�Ʈ�� ��û�� ���� �� ó���ؾ� �� �ϵ��� ���
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
 * 
 * doGet �޼ҵ� ȣ�� : html form �±׿��� method=get�� �� ȣ��, URL �ּ�â�� servlet url�� �Է����� ���� ȣ��.
 * 
 * doPost �޼ҵ� ȣ�� : html form �±׿��� method=post�� �� ȣ��.
 * 
 * throws ���� �ִ� ServletException�� IOException�� ������ ����, �ٸ� exception�� �߰� �� �� ����.
 */

/** ������ ���� ����
 * 
 * �������� --> ������ --> �����ø����̼� ���� --> ���� �����̳�
 * 										   .������ ����
 * 										   .servlet ��ü ����
 * 
 * Servlet ��� : CGI�� ����� �� �ִ� Java ��� (������ CGI�� ������)
 * 
 * 	1) CGI> �ε��� �ʱ�ȭ �۾��� �����ϱ� ������ ������ ���� ������尡 ũ��.
 *	   ����> �ѹ� �޸𸮿� �ε��Ǿ� ����Ǹ� �۾��� ��� ����Ǿ� �������� �޸𸮿��� ���� ���� �ʴ´�(��Ȱ��)
 *			 ������� ���� ��û�� ���͵� �޸� �ε��̳� �ʱ�ȭ�� ó������ �ʴ´�.
 *			 ��� ������ �ѹ��� �޸𸮿� �ε� �Ǿ�����.
 *	2) Ư�� �������� ���������̴�. 
 *	   Java ���� �����Ǵ� ���α׷��̱� ������ �÷���(�ü��)���� ������ ���� ������ ���� �� �ִ�.
 *	   ������ CGI�� ��������� ���ؼ� �߰����� API�� �ʿ��ߴ� �Ϳ� ����, ������ Servlet API�� Ȱ���ؼ� �����ϸ� �ȴ�. ��, Servlet ������ Ȱ���ص� �ȴ�.
 *
 *  3) ������ ��Ƽ������� �����Ѵ�.
 *     Servlet�� CGIó�� ������������ ��û�ϴ� ������ ���μ����� �������� �ʴ´�.
 *     �� ��û�� ���ؼ� ������� �����Ѵ�.
 *
 * 	Servlet �����ֱ� (lifecycle)
 * 	Servlet ��ü���� --> init() ȣ�� --> service(), doGet(), doPost() ȣ�� --> destroy() ȣ��
 * 		���� �ѹ�			���� �ѹ�                 ��û �� �Ź�                    ������ �ѹ�
 */
@WebServlet("/Sev01")
public class Servlet_Demo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet_Demo01() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int sum = 0;
		//for (int cnt = 1; cnt <= 100; cnt++) {
		//	sum += cnt;
		//}
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter(); // ���������� ����� ��Ʈ���� ������ ����
		
		out.println("<html>");
		out.println("<head>");
		//out.println("<title>100���� ��</title>");
		out.println("<title>doget �޼ҵ� ȣ��</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("get����Դϴ�. doGet�޼ҵ� ȣ�� �Ǿ����ϴ�!");
		//out.printf("100���� �� ��� : %d", sum);
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter(); // ���������� ����� ��Ʈ���� ������ ����
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>dopost �޼ҵ� ȣ��</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("post����Դϴ�. doPost�޼ҵ� ȣ�� �Ǿ����ϴ�!");
		out.println("</body>");
		out.println("</html>");
	}
}
