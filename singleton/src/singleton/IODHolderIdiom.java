package singleton;

public class IODHolderIdiom {
	
	private static class Holder{
		private static final IODHolderIdiom INSTANCE = new IODHolderIdiom(); 
	}
	
	public static IODHolderIdiom getInstance() {
		return Holder.INSTANCE;
	}
	
	public void printMessage() {
		System.out.println("this is an Initialization on-demand Holder Idiom singleton instance");
	}
}
