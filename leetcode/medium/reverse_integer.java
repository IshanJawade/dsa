package leetcode.medium;

public class reverse_integer {

	
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
		
	public static void main(String[] args) {
		int n = 12345;
		System.out.println(reverse(n));
	}
}
