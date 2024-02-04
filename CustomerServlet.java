package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.Customer;
@WebServlet(value = {"/req2"})
public class CustomerServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("submit").equalsIgnoreCase("submit"))
		{
			Customer c=new Customer();
			c.setCname(req.getParameter("cname"));
			c.setCemail(req.getParameter("cemail"));
			c.setCphone(req.getParameter("cphone"));
			c.setCaddress(req.getParameter("caddress"));
			c.setCproductname(req.getParameter("cproductname"));
			c.setCprice(Double.parseDouble(req.getParameter("cprice")));
			c.setCpayment(req.getParameter("cpayment"));
			if(new CustomerDao().insertCustomer(c)>0)
				resp.sendRedirect("customerform.jsp");
			else
				resp.sendRedirect("error.jsp");
		}
	}
}
