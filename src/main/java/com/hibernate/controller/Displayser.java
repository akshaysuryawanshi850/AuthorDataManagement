package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.Spring;

import com.hibernate.dao.AutherDAO;
import com.hibernate.dao.AutherDAOImpl;
import com.hibernate.model.Auther;
 
 
@WebServlet("/Displayser")
public class Displayser extends HttpServlet {
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
		PrintWriter out= response.getWriter();
		
		List<Auther> list = dao.allAuther();

		request.setAttribute("list", list);

		request.getRequestDispatcher("jsp/Display.jsp").forward(request, response);
	}
}
