package observer.cofre.comDuasInterfaces;

public class AppCofre {
	
	public static void main(String[] args) {
		Cofre cofreSeguro = new Cofre();
		cofreSeguro.abrir();
		cofreSeguro.fechar();
		
		cofreSeguro.adicionarAbrirListener(new AbrirCofreListenerConsole());
		cofreSeguro.adicionarFecharListener(new FecharCofreListenerConsole());
		
		cofreSeguro.abrir();
		cofreSeguro.fechar();

		System.out.println("Fim.");
	}

}
