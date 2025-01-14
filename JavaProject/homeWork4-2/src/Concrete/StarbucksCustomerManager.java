package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	BaseCustomerManager baseCustomerManager = new BaseCustomerManager();
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	public void Save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) 
			baseCustomerManager.Save(customer);
		else
			System.out.println("Olmadı be ;(");
	}
}
