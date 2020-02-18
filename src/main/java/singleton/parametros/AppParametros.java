package singleton.parametros;

import java.io.InputStream;
import java.util.Properties;

public class AppParametros {
	
	public static void main(String[] args) {
		try {			
			InputStream input = AppParametros.class.getResourceAsStream("parametros.properties");
			Properties parametros = new Properties();
			parametros.load(input);
			input.close();
			
			for (Object nomeDoParametro : parametros.keySet()) {
				System.out.println("Valor de " 
						+ nomeDoParametro + "=" 
						+ parametros.getProperty(nomeDoParametro.toString()));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
