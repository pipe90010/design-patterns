package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		EagerSingleton eagerSingleton = EagerSingleton.getEagerSingleton();
		eagerSingleton.printMessage();
		

	}

}
