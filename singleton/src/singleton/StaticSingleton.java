package singleton;

public class StaticSingleton {
	private static StaticSingleton instance;
	
	private StaticSingleton(){}
	
	static {
		try {
			instance =  new StaticSingleton();
		}catch (Exception e) {
			throw new RuntimeException( "Exception occured in static singleton instance");
		}
	}	
	
	public static StaticSingleton getInstance() {
		return instance;
	}
	
	public void printMessage() {
		System.out.println("This is a Static singleton");
	}
	
}
