package org.hibernate.data.TeamDetails;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.data.TeamDetails.entity.Team_details;
import org.hibernate.data.TeamDetails.utility.HibernateUtility;

public class UsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter team id to Search: ");
			int id = sc.nextInt();

			SessionFactory factory = HibernateUtility.getsessionfactory();

			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			Team_details td = session.find(Team_details.class,id );

			System.out.println(td.toString());

			transaction.commit();
			session.close();
		}
	}


