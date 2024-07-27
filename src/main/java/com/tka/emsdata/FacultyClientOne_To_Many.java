package com.tka.emsdata;

	import java.util.ArrayList;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	public class FacultyClientOne_To_Many {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Configuration conf=new Configuration();
	conf.configure();
	conf.addAnnotatedClass(Faculty.class);
	conf.addAnnotatedClass(FacultySubject.class);

	SessionFactory factory=conf.buildSessionFactory();
	Session sess=factory.openSession();
	Transaction t=sess.beginTransaction();
		
	Faculty a=new Faculty("Meghana");
	FacultySubject b=new FacultySubject("Java");
	FacultySubject c=new FacultySubject("AdvJava");
	ArrayList<FacultySubject> d=new ArrayList();

	d.add(b);
	d.add(c);
	a.setl(d);
	sess.save(a);
	t.commit();
		}

	

	}




