package org.zerock.controller.lecture.p03forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex14")
public class Controller14 {
		//1. 요청받고
		//2. request parameter 수집
		//3. request parameter 가공
		//4. business logic
		//5. add attribute
		//*6. forward / redirect
	@RequestMapping("sub01")
	public void method1(HttpServletRequest req, HttpServletRequest res) throws ServletException, IOException {
		System.out.println("메소드1번 일함");
		String path = "/WEB-INF/views/ex14/sub01.jsp";
		req.getRequestDispatcher(path).forward(req, null);
	}
	
	@RequestMapping("sub02")
	public String method2() {
		System.out.println("메소드2번 일함");
		return "abc";
	}
	
	// sub03경로 /WEB-INF/views/xyz.jsp 로 포워드하는 메소드 작성
	@RequestMapping("sub03")
	public String method3() {
		System.out.println("메소드3번 일함");
		return "xyz";
	}
	
	@RequestMapping("sub04")
	public String method4() {
		// WEB-INF/views/ex14/sub04
		return "ex14/sub04";
	}
	// sub05요청  /WEB-INF/views/ex14/sub05.jsp forward
	@RequestMapping("sub05")
	public String method5() {
		return "ex14/sub05";
	}
}




















