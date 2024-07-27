package com.tka.emsdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration conf=new Configuration();
conf.configure();
conf.addAnnotatedClass(employee.class);

SessionFactory factory=conf.buildSessionFactory();
Session sess=factory.openSession();
employee e=sess.load(employee.class,1);
System.out.println(e);
	}

}
