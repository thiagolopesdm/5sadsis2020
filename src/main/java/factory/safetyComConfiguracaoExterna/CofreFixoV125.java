package factory.safetyComConfiguracaoExterna;

public class CofreFixoV125 implements ArmazenamentoSeguro {

	@Override
	public void armazenar(Object objeto) {
		System.out.println("Armazenando [" + objeto +"] na CofreFixoV125." );
		
	}

}
