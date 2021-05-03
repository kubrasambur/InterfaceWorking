package Odev2;

public class Main {

	public static void main(String[] args) {
		/*
		Customer customer1 = new Customer();
		customer1.setDateOfBirth("01.01.01");
		customer1.setFirstName("Bizim");
		customer1.setLastName("Þirket");
		customer1.setId(1);
		customer1.setNationalityId("12356");
		
		
		
		BaseCustomerManager customerManager=new NeroCustomerManager();		
		customerManager.Save(customer1);*/
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Berkay");
		customer.setLastName("Ergün");
		customer.setDateOfBirth("1999-06-13");
		customer.setNationalityId("12312312312");
		 BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdaptar());
	        customerManager.Save(customer);
	}

}
