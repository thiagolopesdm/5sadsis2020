package observer.cofre;

import java.util.HashSet;
import java.util.Set;

public class Cofre {
	private Set<CofreListener> listeners = new HashSet<>();
	
	public void fechar() {
		System.out.println("fechar()");
		//cofre foi fechado!
		for (CofreListener listener : this.listeners) {
			listener.cofreFoiFechado();
		}
	}
	
		
	public void abrir() {
		System.out.println("abrir()");
		//cofre foi aberto!
		for (CofreListener listener : this.listeners) {
			listener.cofreFoiAberto();
		}
	}

	public void adicionarListener(CofreListenerConsole listener) {
		this.listeners.add(listener);
	}

}
