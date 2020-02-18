package singleton.base;

public class Universo {
	//private static Universo theUniverse = new Universo();
	private static Universo theUniverse;
	
	
	private Universo() {
		System.out.println("Criando o universo!");
	}
	
	public static Universo getInstance() {
		//return new Universo();
		if (theUniverse == null) {
			theUniverse = new Universo();
		}
		return theUniverse;
	}
	
	public static int getVersion() {
		return 321321321;
	}

}
