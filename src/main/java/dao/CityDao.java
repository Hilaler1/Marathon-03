package dao;

import org.hibernate.Session;

import entity.City;

public class CityDao implements IRepository<City> {

	@Override
	public void create(City entity) {
		Session session = null;

		try {
			session = databaseConnection();
			session.getTransaction().begin();
			System.out.println(session);
			session.merge(entity);
			session.getTransaction().commit();
			System.out.println("City data is added to DB");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some problem occured while adding city data.");
		} finally {
			session.close();
		}
	}

	@Override
	public City find(long oid) {

		City city = null;
		Session session = databaseConnection();
		try {
			city = session.find(City.class, oid);
			if (city != null) {
				System.out.println("found city: " + city);
			} else {
				System.out.println("city not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("some problems occured while find city data");
		} finally {
			session.close();
		}
		return city;
	}

}
