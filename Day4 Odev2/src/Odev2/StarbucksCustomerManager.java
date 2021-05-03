package Odev2;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {		
			this._customerCheckService=customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
		System.out.println("Not a valid person");
		}	
	}
public void CheckIfRealPerson(Customer customer) {
		
		
		
	}
	
}
