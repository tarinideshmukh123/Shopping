package com.tka.emsdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Car_Accident_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration conf=new Configuration();
		conf.configure();
		conf.addAnnotatedClass(Car.class);
		conf.addAnnotatedClass(Accident.class);

		SessionFactory factory=conf.buildSessionFactory();
		Session sess=factory.openSession();
		Transaction t=sess.beginTransaction();
		
		Car c=new Car("Maruti");
		Accident a=new Accident("Mumbai");
        
		c.setA(a);
		sess.save(c);
		t.commit();
	}

}
