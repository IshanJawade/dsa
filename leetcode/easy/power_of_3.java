package leetcode.easy;

public class power_of_3 {

	// without loop and recursion
	public static boolean isPowerOfThreeOp(int n) {

		// after 3^19 number excides int limit
		return n > 0 && Math.pow(3, 19)%n == 0;
	}

	// with loop
	public static boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        // keep divide n by 3 untill (n %3 == 0) this becames false
        while(n%3 == 0){
            n = n/3;
        }
        // return true if n == 1
        return n==1;
	}

	// with recursion
	public static boolean isPowerOfThreeR(int n){
		if(n == 1) return true;

		if(n <= 0 || n%3 != 0) return false;
		
		return isPowerOfThreeR(n/3);
	}

	public static void main(String[] args) {
		int num = 45;
		System.out.println(isPowerOfThree(num));
	}
}