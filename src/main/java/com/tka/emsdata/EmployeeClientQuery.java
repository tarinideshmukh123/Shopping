package com.tka.emsdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Query;

public class EmployeeClientQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration conf=new Configuration();
conf.configure();
conf.addAnnotatedClass(employee.class);

SessionFactory factory=conf.buildSessionFactory();
Session sess=factory.openSession();
Query q=sess.createQuery("from employee");
List<employee>lt=q.list();
for(employee e:lt)
	System.out.println(e);
	
Query b=sess.createQuery("select enm from employee");
List<String>st=b.list();
for(String e:st)
	System.out.println(e);
	
Query a=sess.createQuery("from employee where esal>20000");
List<employee>sl=a.list();
for(employee e:sl)
	System.out.println(e);

Query d=sess.createQuery("select enm from employee where esal>2000");
List<String>r=d.list();
for(String e:r)
	System.out.println(e);

Query c=sess.createQuery("from employee where enm=:ename");
c.setParameter("ename", "Shubham");
List<employee>tl=c.list();
for(employee e:tl)
	System.out.println(e);

	}

}
