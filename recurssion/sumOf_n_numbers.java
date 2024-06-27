package recurssion;

public class sumOf_n_numbers {
	static int sum = 0;

	// Normal Recursion
	public static void sumOfnumbers(int i, int n) {
		if( i > n) return;
		sum = sum + i;
		sumOfnumbers(i+1, n);
	}


	// Advanced recursion
	public static void advSumOfNumbers(int i, int advSum){
		if(i < 1) {
			System.out.println(advSum);
			return;
		}
		advSumOfNumbers(i-1, advSum+i);

	}

	public static void main(String[] args) {
		int n = 10;
		sumOfnumbers(1, n);
		System.out.println(sum);

		advSumOfNumbers(n, 0);
	}
}
