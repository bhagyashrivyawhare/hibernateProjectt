package org.employee.management.EmployeeManegementSystem.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
private HibernateUtility() {
	
	}
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionfactory() {
		if(sessionFactory==null) {
			sessionFactory=new Configuration()
					.configure("hibernate.cfg.xml")
					.buildSessionFactory();
			
			
		}
		return sessionFactory;
	}
	

}
