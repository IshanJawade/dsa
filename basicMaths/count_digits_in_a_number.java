package basicMaths;

public class count_digits_in_a_number {
	
	// Arithmatic method
	private static int count_digits(int n) {

		int count=0;  // becase the data tyoe is int why dividing by 10 it will 
					  // ignore digits after decimal point and only return remaining digits
		while(n > 0){ // cleaver!
			n = n/10;
			count++;
		}
		
		return count;
	}

	// String Method
	private static int string_count_digits(int n) {

		String str = "" + n;
		int lenStr = str.length();
		return lenStr;
	}


	public static void main(String[] args) {
		int N = 989035;

		System.out.println("N: "+ N);

		int count = count_digits(N);
		System.out.println("Number of digits in "+N+" is "+ count);

		System.out.println(string_count_digits(N));

	}


}
