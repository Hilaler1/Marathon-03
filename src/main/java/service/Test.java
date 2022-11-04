package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dao.AccountDao;
import dao.CityDao;
import dao.CustomerDao;
import dao.TransactionDao;
import entity.Account;
import entity.City;
import entity.Customer;
import entity.Transaction;

public class Test {

	private static List<City> citiesList = new ArrayList<>();
	private static List<Customer> customersList = new ArrayList<>();
	private static List<Account> accounts = new ArrayList<>();
	private static CustomerDao customerDao = new CustomerDao();
	private static CityDao cityDao = new CityDao();
	private static AccountDao accountDao = new AccountDao();
	private static TransactionDao transactionDao = new TransactionDao();

	public static void main(String[] args) {

		createCustomer();
		createCities();
		createAccounts();
		createTransactions();
		
	}

	private static void createTransactions() {

		Transaction transaction = new Transaction();
		transaction.setNo(100001);
//		transaction.setAccount(accounts.get(0));
		transaction.setType("Deposit");
		transaction.setMethod("ATM");
		transaction.setAmount(400);
		transaction.setDate(LocalDate.of(2022,01,02));
		transactionDao.create(transaction);
		
		Transaction transaction1 = new Transaction();
		transaction1.setNo(100002);
//		transaction1.setAccount(accounts.get(0);
		transaction1.setType("Withdraw");
		transaction1.setMethod("ATM");
		transaction1.setAmount(200);
		transaction1.setDate(LocalDate.of(2022,01,25));
		transactionDao.create(transaction1);
		
		Transaction transaction2 = new Transaction();
		transaction2.setNo(100003);
//		transaction2.setAccount(accounts.get(0);
		transaction2.setType("Deposit");
		transaction2.setMethod("Online");
		transaction2.setAmount(89);
		transaction2.setDate(LocalDate.of(2022,01,20));
		transactionDao.create(transaction2);
		
		Transaction transaction3 = new Transaction();
		transaction3.setNo(100025);
//		transaction3.setAccount(account1);
		transaction3.setType("Deposit");
		transaction3.setMethod("Branch");
		transaction3.setAmount(200);
		transaction3.setDate(LocalDate.of(2022,01,15));
		transactionDao.create(transaction3);
		
		Transaction transaction4 = new Transaction();
		transaction4.setNo(100058);
//		transaction4.setAccount(account2);
		transaction4.setType("Withdraw");
		transaction4.setMethod("ATM");
		transaction4.setAmount(100);
		transaction4.setDate(LocalDate.of(2022,02,02));
		transactionDao.create(transaction4);
		
		Transaction transaction5 = new Transaction();
		transaction5.setNo(100005);
//		transaction5.setAccount(account3);
		transaction5.setType("Deposit");
		transaction5.setMethod("Branch");
		transaction5.setAmount(200);
		transaction5.setDate(LocalDate.of(2022,01,20));
		transactionDao.create(transaction5);
		
		Transaction transaction6 = new Transaction();
		transaction6.setNo(100048);
//		transaction6.setAccount(account3);
		transaction6.setType("Deposit");
		transaction6.setMethod("Online");
		transaction6.setAmount(115);
		transaction6.setDate(LocalDate.of(2022,01,20));
		transactionDao.create(transaction6);
		
			
	}

	private static void createAccounts() {
		Account account = new Account();
		account.setAccountNo("74 100 10");
		account.setBalance(1000);
		account.setUnit("TL");
//		account.setCity(citiesList.get(0));
//		account.setCustomer(customersList.get(0));
		accountDao.create(account);
		accounts.add(account);

		Account account1 = new Account();
		account1.setAccountNo("67 100 11");
		account1.setBalance(1500);
		account1.setUnit("EURO");
//		account1.setCity(citiesList.get(1));
//		account1.setCustomer(customersList.get(0));
		accountDao.create(account1);
		accounts.add(account1);

		Account account2 = new Account();
		account2.setAccountNo("78 101 12");
		account2.setBalance(1200);
		account2.setUnit("USD");
//		account2.setCity(citiesList.get(2));
//		account2.setCustomer(customersList.get(1));
		accountDao.create(account2);
		accounts.add(account2);

		Account account3 = new Account();
		account3.setAccountNo("74 101 10");
		account3.setBalance(3500);
		account3.setUnit("TL");
//		account3.setCity(null);
//		account3.setCustomer(null);
		accountDao.create(account3);
		accounts.add(account3);

	}

	private static void createCustomer() {
		Customer customer = new Customer();
		customer.setFirstname("Ali");
		customer.setLastname("KARA");
		customer.setCustomerNo(100);
		customersList.add(customer);
		customerDao.create(customer);

		Customer customer1 = new Customer();
		customer1.setFirstname("Ayşe");
		customer1.setLastname("SARI");
		customer1.setCustomerNo(101);
		customersList.add(customer1);
		customerDao.create(customer1);
	}

	private static void createCities() {
		City city = new City();
		city.setName("Bartın");
		city.setCode(74);
		cityDao.create(city);
		citiesList.add(city);

		City city1 = new City();
		city1.setName("Zonguldak");
		city1.setCode(67);
		cityDao.create(city1);
		citiesList.add(city1);

		City city2 = new City();
		city2.setName("Karabük");
		city2.setCode(78);
		cityDao.create(city2);
		citiesList.add(city2);
	}

}
