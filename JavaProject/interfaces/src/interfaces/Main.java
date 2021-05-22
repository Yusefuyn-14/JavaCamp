package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers = {new MailLogger(),new SmsLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer customer = new Customer("Yusuf","Kıdır");
		customerManager.delete(customer);
	}

}
