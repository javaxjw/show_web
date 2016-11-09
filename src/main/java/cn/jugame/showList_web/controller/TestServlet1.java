package cn.jugame.showList_web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet1 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3945524859289805068L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		System.out.println("1Get" + name);
		req.getRequestDispatcher("hello.jsp").forward(req, resp);
//		resp.sendRedirect("/test2");
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		System.out.println("1Post" + name);
		req.getRequestDispatcher("/test2").forward(req, resp);
	}
	
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = req.getParameter("name");
//		System.out.println("1Ser" + name);
//		req.getRequestDispatcher("test2").forward(req, resp);
//	}
}
