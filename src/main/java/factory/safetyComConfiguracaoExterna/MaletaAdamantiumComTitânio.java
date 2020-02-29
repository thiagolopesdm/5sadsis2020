package factory.safetyComConfiguracaoExterna;

public class MaletaAdamantiumComTitânio implements ArmazenamentoSeguro {
	@Override
	public void armazenar(Object objeto) {
		System.out.println("Armazenando [" + objeto +"] na MaletaDeAdamantiumComTitânio." );
		
	}

}
