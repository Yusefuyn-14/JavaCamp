package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerServices {

	@Override
	public void Save(Customer customer) {
		System.out.println("Save to db:" + customer.getFirstName());
	}

}
