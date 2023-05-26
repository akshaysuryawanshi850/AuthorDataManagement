package com.hibernate.dao;

 
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Auther;
 import com.hibernate.util.Utility;

public  class AutherDAOImpl implements AutherDAO
{

	@Override
	public void saveAuther(Auther au)
	{
		SessionFactory factory = Utility.getsesionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(au);
		tx.commit();

		System.out.println("Save Data");
		session.close();
	}

	@Override
	public boolean deleteData(int id) 
	{
		SessionFactory Factory=Utility.getsesionFactory();
		Session session=Factory.openSession();
		Transaction tx=session.beginTransaction();
		Auther au=session.get(Auther.class,id);
		if(au!=null)
		{
			session.delete(au);
		}
		tx.commit();
		session.close();
  		return false;
	}

	@Override
	public Auther update(int id) 
	{
		SessionFactory  Factory=Utility.getsesionFactory();
		Session session=Factory.openSession();
		Transaction tx=session.beginTransaction();
  	  Auther aut=(Auther)session.load(Auther.class,id);

 		tx.commit();
		
		
 		return aut;
 		
	}

	 

	@Override
	public Auther update2(Auther au) {
		SessionFactory Factory=Utility.getsesionFactory();
		Session session=Factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(au);
 		tx.commit();
		session.close();
		
 		return null;		 
	}

	@Override
	public List<Auther> allAuther() {
		SessionFactory factory =Utility.getsesionFactory();

		Session session = factory.openSession();

		Query qury=session.createQuery("from Auther a");
		 List<Auther> empList=qury.list();
	 	Transaction tx=session.beginTransaction();
	 	
	 	
		tx.commit();
		factory.close();
		session.close();
		return empList;
	}
	
}
