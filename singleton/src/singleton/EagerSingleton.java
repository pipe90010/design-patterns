package singleton;

public class EagerSingleton {
	private static  EagerSingleton instance = new  EagerSingleton();
	
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
	
	public void printMessage(){
				System.out.println("This is a EagerSingleton example!");
	}
	
}
