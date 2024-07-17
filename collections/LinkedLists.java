package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedLists {
	
	public static void main(String[] args) {
		Queue<Integer> qll = new LinkedList<>();

		qll.offer(2);
		qll.offer(4);
		qll.offer(6);
		qll.offer(8);
		qll.offer(10);

		System.out.println(qll);
		
		qll.poll();
		System.out.println(qll.poll());
		
		System.out.println(qll);

		System.out.println(qll.peek());
	}
}
