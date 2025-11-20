package org.employee.management.EmployeeManegementSystem;

import java.util.ArrayList;
import java.util.List;

import org.employee.management.EmployeeManegementSystem.entity.Employee;
import org.employee.management.EmployeeManegementSystem.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddMultipledata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee();
e1.setId(102);
e1.setName("Ram");
e1.setAge(12);
e1.setDepartment("HR");
e1.setSalary(456.78);

Employee e2=new Employee();
e2.setId(103);
e2.setAge(45);
e2.setName("Sham");
e2.setDepartment("Magager");
e2.setSalary(56.09);

Employee e3=new Employee();
e3.setAge(34);
e3.setDepartment("Finance");
e3.setId(104);
e3.setName("Chetan");
e3.setSalary(789.09);

List<Employee>employeelist=new ArrayList<>();
employeelist.add(e1);
employeelist.add(e2);
employeelist.add(e3);
SessionFactory factory= HibernateUtility.getSessionfactory();
Session session=factory.openSession();
for(Employee employ:employeelist) {
	Transaction transaction=session.beginTransaction();
	session.persist(employ);
	transaction.commit();


	
	
}
session.close();



	}

}
