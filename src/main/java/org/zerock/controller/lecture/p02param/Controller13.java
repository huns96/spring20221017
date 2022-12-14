package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean01;
import org.zerock.domain.lecture.JavaBean02;
import org.zerock.domain.lecture.JavaBean03;

@Controller
@RequestMapping("ex13")
public class Controller13 {

	@GetMapping("sub01")
	public void method1(JavaBean01 bean1) {
		System.out.println("메소드1번 일함");
		
		System.out.println(bean1.getName());
		System.out.println(bean1.getAddress());
		System.out.println(bean1.getEmail());
	}
	
	@RequestMapping("sub02")
	public void method2(JavaBean02 params) {
		System.out.println(params);
	}
	
	@RequestMapping("sub03")
	public void method3(JavaBean03 params) {
		System.out.println(params);
	}

}
