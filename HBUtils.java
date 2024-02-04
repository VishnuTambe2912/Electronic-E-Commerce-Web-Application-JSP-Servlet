package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Admin;
import com.model.Customer;
import com.model.Feedback;

public class HBUtils {

	public static SessionFactory getSessionFactory()
	{
		return new Configuration().setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver")
				.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/vishnu")
				.setProperty("hibernate.connection.username","root")
				.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect")
				.setProperty("hibernate.hbm2ddl.auto","update")
				.setProperty("hibernate.show_sql","true")
				.setProperty("hibernate.format_sql","true")
				.addAnnotatedClass(Admin.class)
				.addAnnotatedClass(Customer.class)
				.addAnnotatedClass(Feedback.class)
				.buildSessionFactory();
	}
}
