package factory.safetyComConfiguracaoExterna;

import java.io.InputStream;
import java.util.Properties;

public class ArmanezamentoSeguroFactory {

	public static ArmazenamentoSeguro criarArmazenamento(String modelo) {
		ArmazenamentoSeguro retorno = null;

		try (InputStream input = ArmanezamentoSeguroFactory.class.getResourceAsStream("factory.properties")) {
			Properties propriedades = new Properties();
			propriedades.load(input);
			String classeParaInstanciar = propriedades.getProperty(modelo);
			Class classe = Class.forName(classeParaInstanciar);
			retorno = (ArmazenamentoSeguro) classe.newInstance();
		} catch (NullPointerException e) {
			return new ArmazenamentoSeguroNull();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return retorno;
	}

}
