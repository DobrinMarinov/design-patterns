package creational.singleton;

public class DbSingleton {
	
	private static DbSingleton instance = null;
	
	private DbSingleton () {}
	
	public static DbSingleton getInstance() {
		//lazy loading
		if(instance == null) {
			instance = new DbSingleton();
		}
		
		return instance;
	}

}