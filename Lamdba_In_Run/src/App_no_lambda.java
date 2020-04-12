
public class App_no_lambda {
	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() { // Runnable is a interface

			@Override
			public void run() {
				System.out.println("i m inside tread 1");
			}
		});
		thread.start();
	}
}
