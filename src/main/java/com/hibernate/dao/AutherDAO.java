package com.hibernate.dao;

import java.util.List;

import com.hibernate.model.Auther;
 
public interface AutherDAO 
{
	void saveAuther(Auther au);
	boolean deleteData(int id);
	Auther update (int id);
	Auther update2(Auther au);
	List<Auther> allAuther();
}
