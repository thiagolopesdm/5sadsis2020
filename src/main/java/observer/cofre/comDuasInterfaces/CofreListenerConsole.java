package observer.cofre.comDuasInterfaces;

import java.util.Date;

public class CofreListenerConsole implements CofreListener {

	@Override
	public void cofreFoiAberto() {
		System.out.println(">> Cofre foi aberto em: " + (new Date()).toLocaleString());
	}

	@Override
	public void cofreFoiFechado() {
		System.out.println(">> Cofre foi fechado em: " + (new Date()).toLocaleString());		
	}

}
