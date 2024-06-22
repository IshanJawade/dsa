package basicMaths;

import java.util.ArrayList;
import java.util.Comparator;

public class divisors {

	// Brutforce method
	private static void findDivisors(int num) {
		ArrayList<Integer> divisors = new ArrayList<>();
		for(int i=1; i <= num; i++){
			if(num%i == 0) divisors.add(i);
		}
		System.out.println(divisors);
	}

	// Optimized method
	public static void OptFindDivisors(int num){
		ArrayList<Integer> divisors = new ArrayList<>();
		for(int i=1; i<=Math.sqrt(num); i++){
			if(num % i == 0){
				divisors.add(i);
				divisors.add(num/i);
			}
		}
		divisors.sort(Comparator.naturalOrder());
		System.out.println(divisors);
	}

	public static void main(String[] args) {
		OptFindDivisors(125);
		findDivisors(125);
	}

}
