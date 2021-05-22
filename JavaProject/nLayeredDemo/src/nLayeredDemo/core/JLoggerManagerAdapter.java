package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String Message) {
		// TODO Auto-generated method stub
		JLoggerManager manager = new JLoggerManager();
		manager.Log(Message);
	}

}
