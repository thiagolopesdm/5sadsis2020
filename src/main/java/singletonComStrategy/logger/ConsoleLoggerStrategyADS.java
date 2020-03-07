package singletonComStrategy.logger;

public class ConsoleLoggerStrategyADS implements LoggerStrategyADS {

	@Override
	public void warn(String message) {
		System.out.println("[WARNING] " + System.currentTimeMillis() + ": "+ message);
	}

	@Override
	public void info(String message) {
		System.out.println("[INFO] " + System.currentTimeMillis() + ": "+ message);		
	}

	@Override
	public void error(String message) {
		System.out.println("[ERROR] " + System.currentTimeMillis() + ": "+ message);		
	}

}
