package singleton.base;

public class AppSingleton {
	
	public static void main(String[] args) {
		
		System.out.println(Universo.getVersion());
		for (int i = 0; i < 5; i++) {
			//System.out.println(new Universo());
			System.out.println(Universo.getInstance());
		}
		
	}

}
