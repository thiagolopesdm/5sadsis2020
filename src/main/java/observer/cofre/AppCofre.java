package observer.cofre;

public class AppCofre {
	
	public static void main(String[] args) {
		Cofre cofreSeguro = new Cofre();
		cofreSeguro.abrir();
		cofreSeguro.fechar();
		
		cofreSeguro.adicionarListener(new CofreListenerConsole());
		
		cofreSeguro.abrir();
		cofreSeguro.fechar();

		System.out.println("Fim.");
	}

}
