package factory.safety;

public class ArmanezamentoSeguroFactory {

	public static ArmazenamentoSeguro criarArmazenamento(String modelo) {
		if (modelo.equalsIgnoreCase("FIXO")) {
			//return new CofreFixoV2(); 
			return new CofreFixoV125(); 
		}  
		if (modelo.equalsIgnoreCase("MÓVEL")) {
			return new CofreMóvel(); 
		}  
		if (modelo.equalsIgnoreCase("MALETA")) {
			//return new MaletaAdamantium(); 
			return new MaletaAdamantiumComTitânio();
		}  
		return null;
	}

}
