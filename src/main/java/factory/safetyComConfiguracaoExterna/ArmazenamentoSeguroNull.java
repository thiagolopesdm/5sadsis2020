package factory.safetyComConfiguracaoExterna;

import java.util.logging.Logger;

public class ArmazenamentoSeguroNull implements ArmazenamentoSeguro {
	private Logger logger = Logger.getLogger(ArmazenamentoSeguroNull.class.getName());

	@Override
	public void armazenar(Object objeto) {
		logger.warning("Armazenamento seguro em modo NullObject! Verifique!!!!");
	}

}
