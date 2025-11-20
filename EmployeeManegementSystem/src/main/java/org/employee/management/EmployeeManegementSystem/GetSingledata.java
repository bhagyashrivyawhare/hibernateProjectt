package org.employee.management.EmployeeManegementSystem;

import org.employee.management.EmployeeManegementSystem.entity.Employee;
import org.employee.management.EmployeeManegementSystem.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class GetSingledata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory fcatory=HibernateUtility.getSessionfactory();
		Session session=fcatory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee e=session.find(Employee.class, 102);
		System.out.println(e.toString());
		transaction.commit();
		session.close();
		

	}

}
