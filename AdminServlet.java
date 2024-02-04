package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDao;
import com.model.Admin;

@WebServlet(value = {"/req1"})
public class AdminServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("submit").equalsIgnoreCase("submit"))
		{
			Admin a=new Admin();
			a.setAname(req.getParameter("aname"));
			a.setAemail(req.getParameter("aemail"));
			a.setApassword(req.getParameter("apassword"));
			a.setAgender(req.getParameter("agender"));
			if(new AdminDao().insertAdmin(a)>0)
				resp.sendRedirect("admin.jsp");
			else
				resp.sendRedirect("error.jsp");
		}
		
		if(req.getParameter("submit").equalsIgnoreCase("login"))
		{
			Admin a=new AdminDao().findAdminByEmailAndPassword(req.getParameter("aemail"), req.getParameter("apassword"));
			if(a!=null)
			{
				req.setAttribute("a", a);
				req.getRequestDispatcher("admin.jsp").forward(req, resp);
			}	
			else
				resp.sendRedirect("index.jsp");
		}
	}
}
