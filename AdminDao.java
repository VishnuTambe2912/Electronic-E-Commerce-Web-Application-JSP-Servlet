package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Admin;
import com.utils.HBUtils;

public class AdminDao {
	
	private Session session=HBUtils.getSessionFactory().openSession();
	private Transaction tx=session.beginTransaction();
	
	public void closeConnection(Transaction tx,Session session)
	{
		tx.commit();
		session.close();
	}
	
	public int insertAdmin(Admin a)
	{
		int check=(int) session.save(a);
		closeConnection(tx, session);
		return check;
	}
	
	public Admin findAdminByEmailAndPassword(String aemail,String apassword)
	{
		return session.createQuery("from Admin where aemail=:a and apassword=:b",Admin.class)
				.setParameter("a", aemail)
				.setParameter("b", apassword)
				.uniqueResult();
	}
}
