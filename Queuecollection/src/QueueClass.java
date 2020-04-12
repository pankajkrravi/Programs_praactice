import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueClass {
	public static void main(String[] args) {
		// Queue<Integer> queue = new LinkedBlockingQueue<Integer>(); //Queue size is
		// not expected i.e we can add as many elements
		Queue<Integer> queue = new ArrayBlockingQueue<>(5);
		/*
		 * try { queue.element(); } catch (Exception e) { // TODO: handle exception }
		 * try { queue.remove(); } catch (Exception e) { // TODO: handle exception }
		 
		try {
			queue.add(6);
			queue.add(5);
			queue.add(8);
			queue.add(20);
			queue.add(11);
			queue.add(1);
		} catch (IllegalStateException e) {
		}*/
		System.out.println(queue.poll());
		
		queue.offer(6); // 
		queue.offer(5);
		queue.offer(8);
		queue.offer(20);
		queue.offer(11);
		queue.offer(1);
		
		
		
		
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		  
		//queue.remove();
		queue.poll();
		System.out.println("=============================");
		//System.out.println("First Element "+ queue.element());
		for (Integer integer : queue) {
			System.out.println(integer);
		}
	}
}
