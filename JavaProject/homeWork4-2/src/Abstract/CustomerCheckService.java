package Abstract;

import Entities.Customer;

// Mernis bağlantısı yapılmadı.
public interface CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer);
}
