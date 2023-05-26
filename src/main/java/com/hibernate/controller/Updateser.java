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

 
@WebServlet("/Updateser")
public class Updateser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AutherDAO dao;
	
	@Override
	public void init() throws ServletException 
	{
		dao=new AutherDAOImpl();
	}
	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id =Integer.parseInt(request.getParameter("id"));
		Auther au=dao.update(id);
		request.setAttribute("au",au);

		request.getRequestDispatcher("jsp/Update.jsp").forward(request, response);

		
 	}

}
