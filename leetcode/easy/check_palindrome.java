package leetcode.easy;

public class check_palindrome {

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
	public static void main(String[] args) {
		int num = 13731;
		System.out.println(isPalindrome(num));
	}
}
