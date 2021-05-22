package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers,Customer customer,String islem) {
		for (Logger logType : loggers){
			logType.log(customer.get_Name() + " Müşterisi " + islem);
		}
	}
}
