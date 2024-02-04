package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Customer;
import com.utils.HBUtils;

public class CustomerDao {

	private Session session=HBUtils.getSessionFactory().openSession();
	private Transaction tx=session.beginTransaction();
	
	public void closeConnection(Transaction tx,Session session)
	{
		tx.commit();
		session.close();
	}
	
	public int insertCustomer(Customer c)
	{
		int check=(int) session.save(c);
		closeConnection(tx, session);
		return check;
	}
	
	public List<Customer> findAllCustomer()
	{
		return session.createCriteria(Customer.class).list();
	}
	
	public Customer findCustomerById(int cid)
	{
		return session.get(Customer.class, cid);
	}
	
}
