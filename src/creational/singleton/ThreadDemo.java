package creational.singleton;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadRun());
		t1.start();
		
		Thread t2 = new Thread(new ThreadRun());
		t2.start();
	}

}
