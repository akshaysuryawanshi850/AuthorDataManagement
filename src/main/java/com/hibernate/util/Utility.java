package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
private static SessionFactory factory;
	
	public static SessionFactory getsesionFactory()
	{
		if(factory==null)
		{
			return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
		
	}

}
