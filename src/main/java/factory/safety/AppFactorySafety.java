package factory.safety;

import java.util.Date;

public class AppFactorySafety {
	
	public static void main(String[] args) {
		
		Empresa unicesumar = new Empresa();
		unicesumar.adicionarArmazenamentoSeguro(ArmanezamentoSeguroFactory.criarArmazenamento("MALETA"));
		unicesumar.adicionarArmazenamentoSeguro(ArmanezamentoSeguroFactory.criarArmazenamento("FIXO"));
		unicesumar.adicionarArmazenamentoSeguro(ArmanezamentoSeguroFactory.criarArmazenamento("FIXO"));
		unicesumar.adicionarArmazenamentoSeguro(ArmanezamentoSeguroFactory.criarArmazenamento("MÓVEL"));
		
		for (ArmazenamentoSeguro as : unicesumar.getArmazenamentosSeguros()) {
			as.armazenar(new Date());
			System.out.println(as.getClass().getName());
		}
		
	}

}
