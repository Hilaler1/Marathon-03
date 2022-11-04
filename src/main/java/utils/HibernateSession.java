package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Account;
import entity.City;
import entity.Customer;
import entity.Transaction;

public class HibernateSession {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		Configuration conf = new Configuration();
		conf.addAnnotatedClass(Customer.class);
		conf.addAnnotatedClass(Account.class);
		conf.addAnnotatedClass(City.class);
		conf.addAnnotatedClass(Transaction.class);
		sessionFactory = conf.configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("connection to postgresql via hibernate successful.");
		return sessionFactory;
	}

}
