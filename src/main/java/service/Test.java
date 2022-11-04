package service;

import java.util.ArrayList;
import java.util.List;

import dao.AccountDao;
import dao.CityDao;
import dao.CustomerDao;
import dao.TransactionDao;
import entity.Account;
import entity.City;
import entity.Customer;

public class Test {

	private static List<City> citiesList = new ArrayList<>();
	private static List<Customer> customersList = new ArrayList<>();
	private static CustomerDao customerDao = new CustomerDao();
	private static CityDao cityDao = new CityDao();
	private static AccountDao accountDao = new AccountDao();
	private static TransactionDao transactionDao = new TransactionDao();
	public static void main(String[] args) {
		
//		HibernateSession.getSessionFactory().openSession();
		createCities();
		createCustomer();
		createAccounts();
		

//		accountsList.add(account);
//		List<Transaction> transactionsList= account.getTransactionsList();
//		
//		AccountDao aDao= new AccountDao();
//		aDao.create(account);
//		
//		Account account1=new Account();
//		account1.setAccountNo("67 100 11");
//		account1.setBalance(1500);
//		account1.setUnit("EURO");
//		account1.setCity(city1);
//		account1.setCustomer(customer);
//		accountsList.add(account1);
//		List<Transaction> transactionsList1= account1.getTransactionsList();
//		
//		AccountDao aDao1= new AccountDao();
//		aDao1.create(account1);
//		
//		Account account2=new Account();
//		account2.setAccountNo("78 101 12");
//		account2.setBalance(1200);
//		account2.setUnit("USD");
//		account2.setCity(city2);
//		account2.setCustomer(customer1);
//		accountsList1.add(account2);
//		List<Transaction> transactionsList2= account2.getTransactionsList();
//		
//		AccountDao aDao2= new AccountDao();
//		aDao2.create(account2);
//		
//		Account account3=new Account();
//		account3.setAccountNo("74 101 10");
//		account3.setBalance(3500);
//		account3.setUnit("TL");
//		account3.setCity(city);
//		account3.setCustomer(customer1);
//		accountsList.add(account3);
//		List<Transaction> transactionsList3= account3.getTransactionsList();
//		
//		AccountDao aDao3= new AccountDao();
//		aDao3.create(account3);
//		
//		
//		Set<Account>accountsList=customer.getAccountList();
//		
//		
//		Set<Account>accountsList1=customer1.getAccountList();
		


//		
//		Transaction transaction = new Transaction();
//		transaction.setNo(100001);
//		transaction.setAccount(account);
//		transaction.setType("Deposit");
//		transaction.setMethod("ATM");
//		transaction.setAmount(400);
//		transaction.setDate(LocalDate.of(2022, 01, 02));
//		TransactionDao transactionDao = new TransactionDao();
//		transactionDao.create(transaction);
//		transactionsList.add(transaction);
//		
//		
//		Transaction transaction1= new Transaction();
//		transaction1.setNo(100002);
//		transaction1.setAccount(account);
//		transaction1.setType("Withdraw");
//		transaction1.setMethod("ATM");
//		transaction1.setAmount(200);
//		transaction1.setDate(LocalDate.of(2022, 01, 25));
//		TransactionDao transactionDao1 = new TransactionDao();
//		transactionDao1.create(transaction1);
//		transactionsList.add(transaction1);
//		
//		
//		Transaction transaction2= new Transaction();
//		transaction2.setNo(100003);
//		transaction2.setAccount(account);
//		transaction2.setType("Deposit");
//		transaction2.setMethod("Online");
//		transaction2.setAmount(89);
//		transaction2.setDate(LocalDate.of(2022, 01, 20));
//		TransactionDao transactionDao2 = new TransactionDao();
//		transactionDao2.create(transaction2);
//		transactionsList.add(transaction2);
//		
//		
//		Transaction transaction3= new Transaction();
//		transaction3.setNo(100025);
//		transaction3.setAccount(account1);
//		transaction3.setType("Deposit");
//		transaction3.setMethod("Branch");
//		transaction3.setAmount(200);
//		transaction3.setDate(LocalDate.of(2022, 01, 15));
//		TransactionDao transactionDao3 = new TransactionDao();
//		transactionDao3.create(transaction3);
//		transactionsList1.add(transaction3);
//		
//		
//		
//		Transaction transaction4= new Transaction();
//		transaction4.setNo(100058);
//		transaction4.setAccount(account2);
//		transaction4.setType("Withdraw");
//		transaction4.setMethod("ATM");
//		transaction4.setAmount(100);
//		transaction4.setDate(LocalDate.of(2022, 02, 02));
//		TransactionDao transactionDao4 = new TransactionDao();
//		transactionDao4.create(transaction4);
//		transactionsList2.add(transaction4);
//		
//		
//		Transaction transaction5= new Transaction();
//		transaction5.setNo(100005);
//		transaction5.setAccount(account3);
//		transaction5.setType("Deposit");
//		transaction5.setMethod("Branch");
//		transaction5.setAmount(200);
//		transaction5.setDate(LocalDate.of(2022, 01, 20));
//		TransactionDao transactionDao5 = new TransactionDao();
//		transactionDao5.create(transaction5);
//		transactionsList3.add(transaction5);
//		
//		
//		
//		Transaction transaction6= new Transaction();
//		transaction6.setNo(100048);
//		transaction6.setAccount(account3);
//		transaction6.setType("Deposit");
//		transaction6.setMethod("Online");
//		transaction6.setAmount(115);
//		transaction6.setDate(LocalDate.of(2022, 01, 20));
//		TransactionDao transactionDao6 = new TransactionDao();
//		transactionDao6.create(transaction6);
//		transactionsList3.add(transaction6);
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static void createAccounts() {
		Account account=new Account();
		account.setAccountNo("74 100 10"); 
		account.setBalance(1000);
		account.setUnit("TL");
		account.setCity(citiesList.get(0));
		account.setCustomer(customersList.get(0));
		List<Account> accounts  = new ArrayList<>();
		accounts.add(account);
		customersList.get(0).setAccountList(accounts);
		customerDao.update(customersList.get(0));
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
