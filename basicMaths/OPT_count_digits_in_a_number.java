package basicMaths;

import java.lang.Math;

public class OPT_count_digits_in_a_number {
	
	private static int count_digits(int n) {
	
		// The logarithmic base 10 of a positive integers gives the number of digits in it. 
		// Yeah... Maths!
		int count = (int) (Math.log10(n)+1);
		
		return count;
	}
	
	public static void main(String[] args) {
		int N = 989035;

		System.out.println("N: "+ N);

		int count = count_digits(N);
		System.out.println("Number of digits in "+N+" is "+ count);

	}

}
