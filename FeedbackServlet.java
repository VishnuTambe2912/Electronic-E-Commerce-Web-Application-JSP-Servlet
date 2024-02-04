package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FeedbackDao;
import com.model.Feedback;

@WebServlet(value = {"/req3"})
public class FeedbackServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("submit").equalsIgnoreCase("submit"))
		{
			Feedback f=new Feedback();
			f.setFname(req.getParameter("fname"));
			f.setFemail(req.getParameter("femail"));
			f.setFfeedback(req.getParameter("ffeedback"));
			if(new FeedbackDao().insertFeedback(f)>0)
				resp.sendRedirect("feedbackform.jsp");
			else
				resp.sendRedirect("error.jsp");
		}
	}
}
