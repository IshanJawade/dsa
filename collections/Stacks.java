package collections;

import java.util.Stack;

public interface Stacks {
	
	public static void main(String[] args) {
		
		Stack<String> Company = new Stack<>();
		
		Company.push("Microsoft");
		Company.push("Apple");
		Company.push("Amazon");
		Company.push("Meta");

		System.out.println(Company);
		
		Company.pop();
		Company.pop();
		
		System.out.println(Company);

		System.out.println("Top : " + Company.peek());
	}
}
