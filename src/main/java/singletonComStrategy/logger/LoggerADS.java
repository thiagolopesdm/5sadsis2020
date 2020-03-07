package singletonComStrategy.logger;

public class LoggerADS {
	private static LoggerADS instance = new LoggerADS();
	private LoggerStrategyADS strategy = new NullLoggerStrategyADS();

	public static LoggerADS getInstance() {
		return instance;
	}

	public void warn(String message) {
		this.strategy.warn(message);
	}
	public void info(String message) {
		this.strategy.info(message);
	}
	public void error(String message) {
		this.strategy.error(message);
	}

	public static LoggerADS getInstance(LoggerStrategyADS strategy) {
		instance.strategy = strategy;
		return instance;
	}
	
	

}
