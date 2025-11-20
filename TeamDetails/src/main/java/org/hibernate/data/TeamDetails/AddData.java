package org.hibernate.data.TeamDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.data.TeamDetails.entity.Team_details;
import org.hibernate.data.TeamDetails.utility.HibernateUtility;

public class AddData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team_details td=new Team_details();
		td.setTeam_id(101);
		td.setCaptain_name("Virat Kholi");
		td.setTeam_name("RCB");
		SessionFactory factory=HibernateUtility.getsessionfactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.persist(td);
		transaction.commit();
		session.close();
		

	}

}
