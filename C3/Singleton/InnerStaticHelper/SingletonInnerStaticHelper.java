package C3.Singleton.InnerStaticHelper;

public class SingletonInnerStaticHelper {
	private SingletonInnerStaticHelper() {
	}
	
	private static class SingletonHelper {
		private static final SingletonInnerStaticHelper instance =
				new SingletonInnerStaticHelper();
	}
	
	public static SingletonInnerStaticHelper getInstance() {
		return SingletonHelper.instance;
	}
}
