package observer.cofre.comDuasInterfaces;

import java.util.Date;

public class AbrirCofreListenerConsole implements AbrirCofreListener {

	@Override
	public void cofreFoiAberto() {
		System.out.println("Cofre aberto em " + new Date().toLocaleString());		
	}

}
