package org.employee.management.EmployeeManegementSystem;

import org.employee.management.EmployeeManegementSystem.entity.Employee;
import org.employee.management.EmployeeManegementSystem.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(101);
		e.setName("Ram");
		e.setAge(32);
		e.setDepartment("Computer Science");
		e.setSalary(436.00);
		SessionFactory factory=HibernateUtility.getSessionfactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.persist(e);
		transaction.commit();
		session.close();
		

	}

}
