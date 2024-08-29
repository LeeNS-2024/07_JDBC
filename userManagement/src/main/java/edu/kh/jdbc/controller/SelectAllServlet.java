package edu.kh.jdbc.controller;

import java.io.IOException;

import edu.kh.jdbc.dto.User;
import edu.kh.jdbc.service.UserService;
import edu.kh.jdbc.service.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/selectAll")
public class SelectAllServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 요청 위임
		String path = "/WEB-INF/views/selectAll.jsp";
		req.getRequestDispatcher(path).forward(req, resp);
		
		try {
			
			
			
			

		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
/*- 클릭 시 /selectAll GET방식 요청 
- 모든 사용자 회원번호, id, pw, name, enrollDate 조회
- 조회 결과를 request scope에 세팅하여
  /WEB-INF/views/selectAll.jsp로 forward

- <table> 태그를 이용해서 모든 정보 출력
 컬럼명 : 회원번호 | 아이디 | 비밀번호 | 이름 | 등록일
 hint. JSTL 중 <c:forEach> 사용*/