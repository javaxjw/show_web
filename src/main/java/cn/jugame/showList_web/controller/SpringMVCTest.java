package cn.jugame.showList_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVCTest {
	
	@RequestMapping(value="/hello")
	public String test(Model m){
//		m.addAttribute("username", "xjw");
		return "hello1";
	}
}
