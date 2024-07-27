package com.tka.emsdata;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration();
		conf.configure();
		conf.addAnnotatedClass(employee.class);

		SessionFactory factory=conf.buildSessionFactory();
		Session sess=factory.openSession();
		
		Query a= sess.createQuery("from Employee where salary between :s and t");
	 a.setParameter("s", 20000.0);
	 a.setParameter("t", 30000.0);
	
	 List<employee> li=a.list();
	
	for(employee e:li)
		System.out.println(e);
	
	}}