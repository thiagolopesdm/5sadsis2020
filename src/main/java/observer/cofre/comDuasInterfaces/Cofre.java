package observer.cofre.comDuasInterfaces;

import java.util.HashSet;
import java.util.Set;

public class Cofre {
	private Set<AbrirCofreListener> abrirListeners = new HashSet<>();
	private Set<FecharCofreListener> fecharListeners = new HashSet<>();
	
	public void fechar() {
		System.out.println("fechar()");
		//cofre foi fechado!
		for (FecharCofreListener listener : this.fecharListeners) {
			listener.cofreFoiFechado();
		}
	}
	
		
	public void abrir() {
		System.out.println("abrir()");
		//cofre foi aberto!
		for (AbrirCofreListener listener : this.abrirListeners) {
			listener.cofreFoiAberto();
		}
	}


	public void adicionarAbrirListener(AbrirCofreListener listener) {
		this.abrirListeners.add(listener);
	}

	public void adicionarFecharListener(FecharCofreListener listener) {
		this.fecharListeners.add(listener);
	}
}
