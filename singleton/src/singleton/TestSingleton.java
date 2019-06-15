package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		EagerSingleton eager = EagerSingleton.getInstance();
		eager.printMessage();
		
		StaticSingleton _static = StaticSingleton.getInstance();
		_static.printMessage();
		
		LazySingleton lazy = LazySingleton.getInstance();
		lazy.printMessage();
		
		ThreadSafeSingleton1 tss1 = ThreadSafeSingleton1.getInstance();
		tss1.printMessage();
		
		ThreadSafeSingleton2 tss2 = ThreadSafeSingleton2.getInstance();
		tss2.printMessage();
		
	}
}
