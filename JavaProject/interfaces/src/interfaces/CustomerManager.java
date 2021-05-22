package interfaces;

public class CustomerManager implements Manager{
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("Müşteri " + customer.get_Name() + " eklendi.");
		Utils.runLoggers(loggers, customer, "Eklendi");
	}
	public void delete(Customer customer) {
		System.out.println("Müşteri " + customer.get_Name() + " silindi.");
		Utils.runLoggers(loggers, customer, "Silindi");
	}
}
