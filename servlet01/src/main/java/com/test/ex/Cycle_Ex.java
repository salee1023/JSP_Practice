package com.test.ex;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet ��ó��(init()��), ��ó��(destroy()��)
// ��ü���� --> init() --> service() --> destroy()
// 
// ��ó���� ���� ������̼� : @PostConstruct, ��ó���� ���� ������̼� : @PreDestroy
// ��ó�� : �����ϴ� ��ü�� ������ ���Ŀ� �ʱ�ȭ �۾��� ������ �޼ҵ忡 ����
// ��ó�� : �����̳ʿ��� ��ü�� �����ϱ� ���� ȣ�� �� �޼ҵ忡 ����


@WebServlet("/Cycle_Ex")
public class Cycle_Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Cycle_Ex() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("init ȣ��");
    }
    
    //@Override
    //protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //	System.out.println("service() ȣ��");
    //}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet ȣ��");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost ȣ��");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy ȣ��");
	}
	
	@PostConstruct
	private void initMethod() {
		System.out.println("postConstruct ȣ��");
	}

	@PreDestroy
	private void preDestroy() {
		System.out.println("preDestroy ȣ��");
	}
}
