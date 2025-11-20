package org.hibernate.data.TeamDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.data.TeamDetails.entity.Team_details;
import org.hibernate.data.TeamDetails.utility.HibernateUtility;

public class GetSingleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtility.getsessionfactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Team_details td=session.find(Team_details.class, 102);
		System.out.println(td.toString());
		transaction.commit();
		session.close();

	}

}
