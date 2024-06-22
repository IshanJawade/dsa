package recurssion;

public class numbers_recursion {

	public static void printNum(int i, int n){
		if(i > n) return;
		System.out.println(i);
		printNum(i+1, n);
	}

	public static void printRevNum(int i, int n){
		if (n < i) return;
		System.out.println(n);
		printRevNum(i, n-1);
	}

	public static void main(String[] args) {
		int n = 5;
		printNum(1, n);
		printRevNum(1, n);
	}
}
