package factory.safetyComConfiguracaoExterna;

public class CofreFixoV2 implements ArmazenamentoSeguro {

	@Override
	public void armazenar(Object objeto) {
		System.out.println("Armazenando [" + objeto +"] no CofreFixoV2." );
		
	}

}
