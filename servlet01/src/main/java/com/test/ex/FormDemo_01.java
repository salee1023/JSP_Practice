package com.test.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormD_01")
public class FormDemo_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FormDemo_01() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		request.setCharacterEncoding("EUC-KR");
		
		// 한글처리
		// 톰캣서버의 default 문자 처리 방식은 ISO-8859-1 방식이다.
		// 개발자는 별도의 한글 인코딩을 하지 않으면 한글이 깨질 수 있다.
		
		// get 방식과 post 방식의 한글처리가 다르다.
		// get 방식의 한글처리는 톰캣서버 폴더내에 있는 server.xml에서 <connector>에 URIEncoding="EUC-KR"
		
		// post 방식의 한글처리는 doPost 메소드 내에서 설정한다.
		// request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pw");
		String[] hobbys = request.getParameterValues("hobby");
		String sex = request.getParameter("gender");
		String local = request.getParameter("local");
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("이름 : "+name+"<br/>");
		out.println("아이디 : "+id+"<br/>");
		out.println("비밀번호 : "+pass+"<br/>");
		out.println("취미 : "+Arrays.toString(hobbys)+"<br/>");
		out.println("성별 : "+sex+"<br/>");
		out.println("지역 : "+local+"<br/>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
