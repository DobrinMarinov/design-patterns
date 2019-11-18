package creational.singleton;

public class DbSingleton {
	//volatile added for thread safety + synchronized block and additional null check
	private static volatile DbSingleton instance = null;
	
	private DbSingleton () {
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method to create object");
		}
	}
	
	public static DbSingleton getInstance() {
		//lazy loaded
		if(instance == null) {
			//making it thread safe
			synchronized (DbSingleton.class) {
				if(instance == null) {
					instance = new DbSingleton();
				}
			}			
		}
		
		return instance;
	}

}
