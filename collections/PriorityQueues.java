package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
	public static void main(String[] args) {
		
		// BY default following min heap 
		Queue<Integer> qll = new PriorityQueue<>();

		qll.offer(2);
		qll.offer(41);
		qll.offer(65);
		qll.offer(83);
		qll.offer(10);

		System.out.println(qll);
		
		qll.poll();
		System.out.println(qll.poll());
		
		System.out.println(qll);

		System.out.println(qll.peek());


		// Max Heap by using comparator
		Queue<Integer> rqll = new PriorityQueue<>(Comparator.reverseOrder());

		rqll.offer(2);
		rqll.offer(41);
		rqll.offer(65);
		rqll.offer(83);
		rqll.offer(10);

		System.out.println(rqll);
		
		rqll.poll();
		System.out.println(rqll.poll());
		
		System.out.println(rqll);

		System.out.println(rqll.peek());
	}
}
