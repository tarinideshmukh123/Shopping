package com.tka.emsdata;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class EmployeeClient_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration conf=new Configuration();
conf.configure();
conf.addAnnotatedClass(employee.class);

SessionFactory factory=conf.buildSessionFactory();
Session sess=factory.openSession();
Criteria c=sess.createCriteria(employee.class);
//select * from employee
List<employee> lt=c.list();
for(employee e:lt)
	System.out.println(e);
//to add a condition ie where enm=Ravi clause
c.add(Restrictions.eq("enm","Shubham"));
System.out.println("Using where condition");	
	lt=c.list();
	for(employee e:lt)
		System.out.println(e);
		
	}

}
