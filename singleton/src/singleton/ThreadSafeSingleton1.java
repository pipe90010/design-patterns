package singleton;

public class ThreadSafeSingleton1 {
	
	private static ThreadSafeSingleton1 instance;
	
	private ThreadSafeSingleton1() {}
	
	public static synchronized ThreadSafeSingleton1 getInstance() {
		if(instance==null)
			instance = new ThreadSafeSingleton1();
		return instance;
	}

	public void printMessage() {
		System.out.println("this is an thread safe singleton instance");
	}
}
