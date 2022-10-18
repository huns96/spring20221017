package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex05")
public class Controller05 {

	@RequestMapping(value="sub01", method=RequestMethod.GET)
	public void method1() {
		System.out.println("method1 !!!!!!!");
	}
	
	//@RequestMapping(method=RequestMethod.GET)
	@GetMapping("sub02")
	public void method2() {
		System.out.println("method2 @@@@@@@");
	}
	
	@PostMapping("sub2")
	public void method3() {
		System.out.println("method3 #######");
	}
}