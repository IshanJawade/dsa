package basicMaths;

public class reverse_a_number {

	// Arithmatical method
	public static int reverse(int x) {
		long rnum = 0;
		while(x != 0){
			rnum = rnum * 10 + (x % 10);
			x = x / 10;
			if (rnum > Integer.MAX_VALUE || rnum < Integer.MIN_VALUE){
				return 0;
			} 
		}
		return (int) rnum;
	}

	// String method
	public static int strReverse(int num){
		String str = "";

		while(num > 0){
			str = str + num%10;  // Extract last digit form the number and storing it in string
			num = num / 10;		 // deleting last digit from the number
		}
		
		int rNum = Integer.parseInt(str); // Converting String to int
		return rNum;
	}

	public static void main(String[] args) {
		
		int N = -246893;
		System.out.println("N: "+ N);

		int revNum = reverse(N);
		System.out.println("The reverse of "+ N + " is "+ revNum); // Arithmatic method answer
		//System.out.println( strReverse(N)); // String method answer
	}
}
