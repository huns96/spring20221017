package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex02")
// 클래스와 같이 사용하면 / 생략 가능
public class Controller02 {
	
	// 요청경로 ("/ex02/sub01")
	@RequestMapping("sub01")
	public void method1() {
		System.out.println("ex02 메소드1 일함");
	}

	// "/ex02/sub02"
	@RequestMapping("sub02")
	public void method2() {
		System.out.println("ex02 메소드2 일함");
	}
	
	// "/ex02/sub03" 요청 경로에서 일하는 메소드 작성
	@RequestMapping("sub03")
	public void method3() {
		System.out.println("ex02 메소드3 일함");
	}
}