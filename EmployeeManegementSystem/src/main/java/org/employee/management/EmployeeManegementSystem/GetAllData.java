package org.employee.management.EmployeeManegementSystem;

import java.util.List;

import org.employee.management.EmployeeManegementSystem.entity.Employee;
import org.employee.management.EmployeeManegementSystem.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class GetAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtility.getSessionfactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Employee>employee=session.createNativeQuery("select* from employee", Employee.class).getResultList();
		employee.stream().forEach(x->System.out.println(x.toString()));
		transaction.commit();
		session.close();

	}

}
