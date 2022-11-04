package dao;

import org.hibernate.Session;

import utils.HibernateSession;

public interface IRepository<T> {

	public void create(T entity);

	T find(long id);

	default Session databaseConnection() {
		return HibernateSession.getSessionFactory().openSession();
	}

}
