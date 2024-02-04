package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Feedback;
import com.utils.HBUtils;

public class FeedbackDao {

	private Session session=HBUtils.getSessionFactory().openSession();
	private Transaction tx=session.beginTransaction();
	
	public void closeConnection(Transaction tx,Session session)
	{
		tx.commit();
		session.close();
	}
	
	public int insertFeedback(Feedback f)
	{
		int check=(int) session.save(f);
		closeConnection(tx, session);
		return check;
	}
	
	public List<Feedback> findAllFeedback()
	{
		return session.createCriteria(Feedback.class).list();
	}
	
	public Feedback findFeedbackById(int fid)
	{
		return session.get(Feedback.class,fid);
	}
}
