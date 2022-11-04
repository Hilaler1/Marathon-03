package dao;

import org.hibernate.Session;

import entity.Account;

public class AccountDao implements IRepository<Account> {

	@Override
	public void create(Account entity) {
		Session session = null;

		try {
			session = databaseConnection();
			session.getTransaction().begin();
			System.out.println(session);
			session.merge(entity);
			session.getTransaction().commit();
			System.out.println("Account data is added to DB");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some problem occured while adding account data.");
		} finally {
			session.close();
		}

	}

	@Override
	public Account find(long oid) {
		Account account = null;
		Session session = databaseConnection();
		try {
			account = session.find(Account.class, oid);
			if (account != null) {
				System.out.println("Found account : " + account);
			} else {
				System.out.println("account not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some problem occured while finding the account data.");
		} finally {
			session.close();
		}
		return account;

	}

}
