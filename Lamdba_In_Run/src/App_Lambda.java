
public class App_Lambda {
	public static void main(String[] args) {
		//Thread thread1 = new Thread(() -> System.out.println("i m inside Thread 1 "));
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
			}
		});
		thread1.start();
	}
}
