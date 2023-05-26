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

 
@WebServlet("/InsertSev")
public class InsertSev extends HttpServlet {
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
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int price =Integer.parseInt(request.getParameter("price"));
		String book=request.getParameter("book");
		String gender=request.getParameter("gender");
		
		Auther au=new Auther();
		au.setName(name);
		au.setEmail(email);
		au.setPrice(price);
		au.setBook(book);
		au.setGender(gender);
		dao.saveAuther(au);
		response.sendRedirect("jsp/Display.jsp");
		out.print(au);
 	}

}
