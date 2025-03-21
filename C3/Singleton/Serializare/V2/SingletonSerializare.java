package C3.Singleton.Serializare.V2;

import java.io.Serializable;

public class SingletonSerializare implements Serializable{
	private static long serialVersion = 123456789;
	
	private SingletonSerializare() {
		
	}
	
	private static class SingletonHelper {
		private static final SingletonSerializare instance 
		= new SingletonSerializare();
	}
	
	public static SingletonSerializare getInstance() {
		return SingletonHelper.instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
	
	public void setSerialVersion(long serialVersion) {
		this.serialVersion = serialVersion;
	}
	
	public long getSerialVersion() {
		return this.serialVersion;
	}
}
