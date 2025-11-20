package org.hibernate.data.TeamDetails;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.data.TeamDetails.entity.Team_details;
import org.hibernate.data.TeamDetails.utility.HibernateUtility;

public class AddMultipleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team_details td=new Team_details();
		td.setTeam_id(102);
		td.setTeam_name("MI");
		td.setCaptain_name("Hardik Pandy");
		Team_details td1=new Team_details();
		td1.setTeam_id(103);
		td1.setCaptain_name("Ruturaj Gaikwad ");
		td1.setTeam_name("CSK");
		
		Team_details td2=new Team_details();
		td2.setTeam_id(104);
		td2.setTeam_name("KKR");
		td2.setCaptain_name( "Ajinkya Rahane");
		
		Team_details td3=new Team_details();
		td3.setTeam_id(105);
		td3.setCaptain_name("Shreyas Iyer");
		td3.setTeam_name("PBKS");
		
		List<Team_details>team=new ArrayList<>();
		team.add(td);
		team.add(td1);
		team.add(td2);
		team.add(td3);
		SessionFactory factory=HibernateUtility.getsessionfactory();
		Session session=factory.openSession();
		for(Team_details teamlist:team) {
			Transaction transaction=session.beginTransaction();
			session.persist(teamlist);
			transaction.commit();
			
		}
		session.close();
		
		

	}

}
