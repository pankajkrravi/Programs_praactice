
public class Thread_Creation_usng_Lambda {
	public static void main(String[] args) {
         new Thread(()->{
        	 System.out.println("I m in stamt 1");
        	 System.out.println("I m in stamt 2");
         }).start();;
	}
}
