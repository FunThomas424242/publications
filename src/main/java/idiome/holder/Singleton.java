package idiome.holder;

public class Singleton {

	private Singleton(){}
	
	private static class Holder{
		private static final Singleton INSTANCE = new Singleton();
		private Holder(){}
	}
	
	public static Singleton getInstance(){
		return Holder.INSTANCE;
	}
	
}
