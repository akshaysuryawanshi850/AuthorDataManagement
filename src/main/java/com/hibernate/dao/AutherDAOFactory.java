package com.hibernate.dao;

public class AutherDAOFactory 
{
	public static AutherDAO getInstance()
	{
		return new AutherDAOImpl();
		
		
	}
}
