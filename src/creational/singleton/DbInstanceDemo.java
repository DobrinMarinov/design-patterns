package creational.singleton;

public class DbInstanceDemo {
	
	public static void main(String[] args) {
		DbSingleton dbSingleton = DbSingleton.getInstance();
		
		DbSingleton newInstance = DbSingleton.getInstance();
		
		System.out.println(dbSingleton);
		System.out.println(newInstance);
	}

}
