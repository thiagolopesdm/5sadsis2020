package observer.cofre.comDuasInterfaces;

import java.util.Date;

public class FecharCofreListenerConsole implements FecharCofreListener {

	@Override
	public void cofreFoiFechado() {
		System.out.println("Cofre fechado em " + new Date().toLocaleString());		
	}

}
