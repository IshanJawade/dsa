package basicMaths;

public class check_palindrome {
	
	// Arithmatic method
	public static boolean isPalindrome(int x) {
        boolean pCheck = false;
        int rnum = 0;
		int num = x;
		while(x != 0 ){
			rnum = rnum * 10 + (x % 10);
			x = x / 10;
		}
        if(num == rnum){
            pCheck = true;
        }
        if (num < 0){
            pCheck = false;
        }
		return pCheck;
    }

	// String Method
	
	public static void main(String[] args) {
		int N = 4554;
		System.out.println(isPalindrome(N));
	}

}
