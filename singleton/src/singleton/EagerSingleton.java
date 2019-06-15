package singleton;

public class EagerSingleton {
	private static  EagerSingleton singleton = new  EagerSingleton();
	
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getEagerSingleton() {
		return singleton;
	}
	
	public void printMessage(){
				System.out.println("This is a EagerSingleton example!");
	}
	
}
