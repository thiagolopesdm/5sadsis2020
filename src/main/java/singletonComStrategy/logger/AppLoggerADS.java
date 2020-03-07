package singletonComStrategy.logger;

public class AppLoggerADS {
	
	public static void main(String[] args) {
		LoggerADS logger = LoggerADS.getInstance(new JOptionPaneLoggerStrategyADS());
		logger.warn("Cuidado, o coronavirus está chegando! :P");
		logger.error("Coronavirus identificado!");
		logger.info("Vacina para coronavirus desenvolvida!");
		
		System.out.println("E foi...");
	}

}
