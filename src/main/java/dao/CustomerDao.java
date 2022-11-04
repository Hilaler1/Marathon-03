package dao;

import org.hibernate.Session;

import entity.Customer;

public class CustomerDao implements IRepository<Customer> {

	public void update(Customer entity) {
		Session session = null;
		try {
			session = databaseConnection();
			session.getTransaction().begin();
			session.merge(entity);
			session.getTransaction().commit();
			System.out.println("succesfully updated");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some problem occured while UPDATING Customer data.");
		} finally {
			session.close();
		}

	}

	@Override
	public void create(Customer entity) {
		Session session = null;

		try {
			session = databaseConnection();
			session.getTransaction().begin();
			System.out.println(session);
			session.merge(entity);
			session.getTransaction().commit();
			System.out.println("Customer data is added to DB");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some problem occured while adding Customer data.");
		} finally {
			session.close();
		}

	}

	@Override
	public Customer find(long oid) {
		Customer customer = null;
		Session session = databaseConnection();
		try {
			customer = session.find(Customer.class, oid);
			if (customer != null) {
				System.out.println("Found customer : " + customer);
			} else {
				System.out.println("customer not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some problem occured while finding the customer data.");
		} finally {
			session.close();
		}
		return customer;
	}
}
