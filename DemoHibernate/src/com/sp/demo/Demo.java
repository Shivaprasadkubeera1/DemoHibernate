package com.sp.demo;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

class Demo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
//		Serializable id = session.save(new Student(3, "prasad", 100));
//		session.getTransaction().commit();

		//	Student s = session.get(Student.class, 1);
		//	System.out.println(s);
		//Hibernate query language
		Query q = session.createQuery("from Student");
		List<Student> list = q.getResultList();
//		Iterator<Student> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	
		for (Object student : list) {
			System.out.println(student);
		}
		System.out.println("Thank you");

	}
}
