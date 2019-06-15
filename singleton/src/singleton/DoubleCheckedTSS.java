package singleton;

public class DoubleCheckedTSS {
	private static DoubleCheckedTSS instance;
	
	private DoubleCheckedTSS() {}
	
	public static DoubleCheckedTSS getInstance() {
		if(instance==null)
			synchronized (DoubleCheckedTSS.class) {
				if(instance==null)
					return instance = new DoubleCheckedTSS();
			}
		return instance;
	}
	
	public void printMessage() {
		System.out.println("this is a Double-Checked Thread safe singleton instance");
	}
}
