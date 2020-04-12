import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DqueueDemo {
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
		deque.add(2);
		deque.add(22);
		deque.add(23);
		deque.add(21);
		deque.add(45);
		deque.add(4);
		deque.add(20);
		for (Integer integer : deque) {
			System.out.println(integer);
		}
		System.out.println();
	System.out.println("============================="); // gothrough methods present on oracle doc
		deque.addFirst(0);
		deque.removeLast();
		for (Integer integer : deque) {
			System.out.println(integer);
		}
	}
}
