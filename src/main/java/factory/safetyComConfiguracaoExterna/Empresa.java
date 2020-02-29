package factory.safetyComConfiguracaoExterna;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<ArmazenamentoSeguro> armazenamentosSeguros = new ArrayList<>();

	public void adicionarArmazenamentoSeguro(ArmazenamentoSeguro as) {
		armazenamentosSeguros.add(as);
	}
	
	public List<ArmazenamentoSeguro> getArmazenamentosSeguros() {
		return armazenamentosSeguros;
	}

}
