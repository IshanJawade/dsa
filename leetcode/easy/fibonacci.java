package leetcode.easy;

// this code directly returns the value of nth index in the fibonacci series
public class fibonacci {

	public static int fib(int n) {
        int sum = 0;
		int x = 1;
		int y = 0;
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else {
		    for(int i=1; i < n; i++){
				sum = x+y;
				y = x;
				x = sum;
			}
        }
        return sum;
    }

	public static void main(String[] args) {
		int num = 10;
		System.out.println(fib(num));
	}
}
