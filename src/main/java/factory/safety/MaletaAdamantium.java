package factory.safety;

public class MaletaAdamantium implements ArmazenamentoSeguro {
	@Override
	public void armazenar(Object objeto) {
		System.out.println("Armazenando [" + objeto +"] na MaletaDeAdamantium." );
		
	}

}
