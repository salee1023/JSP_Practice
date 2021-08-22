package com.test.ex;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet 선처리(init()전), 후처리(destroy()후)
// 객체생성 --> init() --> service() --> destroy()
// 
// 선처리를 위한 어노테이션 : @PostConstruct, 후처리를 위한 어노테이션 : @PreDestroy
// 선처리 : 의존하는 객체를 설정한 이후에 초기화 작업을 수행할 메소드에 적용
// 후처리 : 컨테이너에서 객체를 제거하기 전에 호출 된 메소드에 적용


@WebServlet("/Cycle_Ex")
public class Cycle_Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Cycle_Ex() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("init 호출");
    }
    
    //@Override
    //protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //	System.out.println("service() 호출");
    //}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 호출");
	}
	
	@PostConstruct
	private void initMethod() {
		System.out.println("postConstruct 호출");
	}

	@PreDestroy
	private void preDestroy() {
		System.out.println("preDestroy 호출");
	}
}
