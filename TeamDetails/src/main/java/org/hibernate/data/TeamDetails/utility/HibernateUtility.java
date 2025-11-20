package org.hibernate.data.TeamDetails.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private HibernateUtility() {
		
	}
	private static SessionFactory sessionfactory;
	public static SessionFactory getsessionfactory() {
		if(sessionfactory==null) {
			sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
		}
		return sessionfactory;
		
	}

}
