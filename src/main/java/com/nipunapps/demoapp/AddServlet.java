package com.nipunapps.demoapp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest req,HttpServletResponse res)
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		System.out.println("Result is "+ k);
	}
}
