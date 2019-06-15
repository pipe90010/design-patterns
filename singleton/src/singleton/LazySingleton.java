package singleton;

public class LazySingleton {
	
	private static LazySingleton instance;
	
	private LazySingleton(){}

	public static LazySingleton getInstance() {
		
		if(instance==null)
			return instance = new LazySingleton();
		return instance;
	}
	
	public void printMessage() {
		System.out.println("this is an lazy singleton instance");
	}
}
