package dao;

import org.hibernate.Session;

import entity.Transaction;

public class TransactionDao implements IRepository<Transaction> {

	@Override
	public void create(Transaction entity) {
		Session session = null;

		try {
			session = databaseConnection();
			session.getTransaction().begin();
			System.out.println(session);
			session.merge(entity);
			session.getTransaction().commit();
			System.out.println("Transaction data is added to DB");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some problem occured while adding transaction data.");
		} finally {
			session.close();
		}

	}

	@Override
	public Transaction find(long oid) {

		Transaction transaction = null;
		Session session = databaseConnection();
		try {
			transaction = session.find(Transaction.class, oid);
			if (transaction != null) {
				System.out.println("Found transaction : " + transaction);
			} else {
				System.out.println("Transaction not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some problem occured while finding the transaction data.");
		} finally {
			session.close();
		}
		return transaction;

	}

}
