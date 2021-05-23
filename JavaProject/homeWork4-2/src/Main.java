import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager CustomerManager = new NeroCustomerManager();
		// new StarbucksCustomerManager(new CustomerCheckManager())
		
		
		Customer customer = new Customer();
		customer.setID(1);
		customer.setFirstName("Engin");
		customer.setLastName("Demiroğ");
		customer.setNationalityId("288******08");
		
		CustomerManager.Save(customer);
	}

}
