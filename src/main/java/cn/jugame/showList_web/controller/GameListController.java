package cn.jugame.showList_web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jugame.showList_web.bean.Person;

@Controller
public class GameListController {
	
	@RequestMapping(value="game-list")
	public String showGameList(HttpServletRequest request, HttpServletResponse response, Model model ,Person person){
		
//		System.out.println(person.getMap().get("1").getGameId());
//		System.out.println(i);
		return "gameList";
	}
	
	@RequestMapping(value="game-list2")
	public String showGameList2(HttpServletRequest request, HttpServletResponse response, Model model){
		
		String name = request.getParameter("name");
		System.out.println(name);
		 name = request.getAttribute("name") + "";
		System.out.println(name);
//		model.addAttribute("name","xjw");
//		request.setAttribute("name", name);
		return "gameList";
	}
}
