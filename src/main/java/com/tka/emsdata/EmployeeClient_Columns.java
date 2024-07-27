package com.tka.emsdata;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
public class EmployeeClient_Columns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration conf=new Configuration();
conf.configure();
conf.addAnnotatedClass(employee.class);

SessionFactory factory=conf.buildSessionFactory();
Session sess=factory.openSession();
Criteria c=sess.createCriteria(employee.class);
Projection p=Projections.property("enm");
c.setProjection(p);
List<String> lt=c.list();
for(String e:lt)
	System.out.println(e);
System.out.println("More than one column");
Projection b=Projections.property("e  sal");
ProjectionList s=Projections.projectionList();
s.add(p);
s.add(b);
c.setProjection(s);
List<Object[]> lt1=c.list();
for(Object[] e:lt1)
{
	for(Object obj:e)
		System.out.println(obj.toString());
}
	
	}

}
