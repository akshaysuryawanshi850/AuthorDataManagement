package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.dao.AutherDAO;
import com.hibernate.dao.AutherDAOImpl;
import com.hibernate.model.Auther;

 
@WebServlet("/Updateser2")
public class Updateser2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AutherDAO dao;
	@Override
	public void init() throws ServletException
	{
		dao=new AutherDAOImpl();
 		super.init();
	}
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		int price=Integer.parseInt(request.getParameter("price"));
		String book=request.getParameter("book");
		String gender=request.getParameter("gender");
		
		Auther au=new Auther(id,name,email,price,book,gender);
		
		Auther a=dao.update2(au);
		request.getRequestDispatcher("jsp/Display.jsp").forward(request, response);

			
 	}

}
