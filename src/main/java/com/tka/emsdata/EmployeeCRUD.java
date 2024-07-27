package com.tka.emsdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration();
		conf.configure();
		conf.addAnnotatedClass(employee.class);

		SessionFactory factory=conf.buildSessionFactory();
		Session sess=factory.openSession();
		Transaction t=sess.beginTransaction();
		//insert
       // employee e=new employee(30,"Shubham",212);
      //  sess.save(e);
		//update
		employee a=new employee(30,"Shubham",3012);
		sess.update(a);
		//delete
		employee b=new employee(1,"a",32000);
		sess.delete(b);
		t.commit();
			}
	}


