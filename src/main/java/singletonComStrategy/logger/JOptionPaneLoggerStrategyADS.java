package singletonComStrategy.logger;

import javax.swing.JOptionPane;

public class JOptionPaneLoggerStrategyADS implements LoggerStrategyADS {

	@Override
	public void warn(String message) {
		message = "[WARNING] " + System.currentTimeMillis() + ": "+ message;
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public void info(String message) {
		message = "[INFO] " + System.currentTimeMillis() + ": "+ message;
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public void error(String message) {
		message = "[ERROR] " + System.currentTimeMillis() + ": "+ message;
		JOptionPane.showMessageDialog(null, message);
	}

}
