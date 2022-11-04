package service;

import java.util.Scanner;

import dao.CustomerDao;
import entity.Customer;

public class BankService {

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("---welcome to the Bank---");
			System.out.println("1-Show customer information");
			System.out.println("0-Exit");
			int selection = scanner.nextInt();
			if (selection == 0) {
				System.out.println("goodbye..");
				break;
			}
			if(selection==1) {
				System.out.println("please enter customer no: ");
				int customerNo=scanner.nextInt();
				showInfo(customerNo);
			}
		}

	}

	private void showInfo(int number) {
		CustomerDao cDao= new CustomerDao();
		Customer customer = cDao.find(number);
		System.out.println("Customerno: "+ customer.getCustomerNo());
		System.out.println("----Customer firstname: "+ customer.getFirstname());
		System.out.println("-------Customer lastname:"+ customer.getLastname());
		System.out.println(customer.getAccountList().toString());
//		AccountDao accountDao= new AccountDao();
//		accountDao.find(customer.getOid());
//		
//		CityDao cityDao= new CityDao();
//		City city = cityDao.find(number);
		
		
	}

}
