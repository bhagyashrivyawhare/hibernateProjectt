package org.hibernate.data.TeamDetails;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.data.TeamDetails.entity.Team_details;
import org.hibernate.data.TeamDetails.utility.HibernateUtility;



public class GetMultipleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtility.getsessionfactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Team_details>list=session.createNativeQuery("select * from Team_details", Team_details.class).getResultList();
		list.stream().forEach(x->System.out.println(x.toString()));
		transaction.commit();
		session.close();

	}

}
