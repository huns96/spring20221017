package org.zerock.controller.lecture.p03forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex15")
public class Controller15 {
	
	@RequestMapping("sub01")
	public void method1() {
		System.out.println("메소드1번 일함 @#!@#!@#!@#");
	}
	
	// sub02요청
	// /WEB-INF/views/ex15/sub02.jsp로 포워드
	@RequestMapping("sub02")
	public void method2() {
		System.out.println("메소드2번 일함 !@#!@#!#");
	}

	@RequestMapping("sub03")
	public String method3() {
		return null; // void 처럼 default view name을 사용하여 view로 포워드
	}
	
	// sub04 요청
	// /WEB-INF/ex15/sub04.jsp로 포워드
	@RequestMapping("sub04")
	public String method4() {
		return null;
	}
	
	// sub05 요청
	// name request param이 있으면
	// WEP-INF/views/ex15/sub051.jsp로 forward
	// 없으면
	// WEP-INF/views/ex15/sub05.jsp로 forward
	
	@RequestMapping("sub05")
	public String method5(String name) {
		if(name==null) {
			return null;
		}
		
		return "ex15/sub051";
	}
	
	// sub06 요청
	// address request param이 있으면 
	// WEB-INF/views/ex15/sub061.jsp로 forward
	// 없으면 
	// WEB-INF/views/ex15/sub06.jsp로 forward
	
	@RequestMapping(path = "sub06", params = "address")
	public String method6() {
		return "ex15/sub061";
	}
	
	@RequestMapping("sub06")
	public String method7() {
		return null;
	}
}

















