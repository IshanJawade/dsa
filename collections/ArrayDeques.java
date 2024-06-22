package collections;

import java.util.ArrayDeque;

public interface ArrayDeques {
	public static void main(String[] args) {
		
		ArrayDeque<Integer> numbers = new ArrayDeque<>();

		numbers.offer(89);
		numbers.offer(13);
		numbers.offer(89);
		numbers.offer(25);
		numbers.offerFirst(67);
		numbers.offerLast(54);

		System.out.println(numbers);

		numbers.poll();
		System.out.println(numbers.poll());
		System.out.println(numbers.pollFirst());
		System.out.println(numbers.pollLast());

		System.out.println(numbers);
		
	}
	
}