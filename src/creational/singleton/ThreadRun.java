package creational.singleton;

public class ThreadRun implements Runnable {

	@Override
	public void run() {
		DbSingleton instance = DbSingleton.getInstance();
		System.out.println(instance);
		
	}	

}
