package recurssion;

public class sumation {

	
	// Parameterized Recursion
	public static void findSumation(int n, int sum){
		if( n == 0){
			System.out.println(sum);
			return;
		} 
		findSumation(n-1, sum+n);
	}

	// Functional Recursion
	public static int functionalFindSumation(int n){
		if(n == 1){
			return 1;
		}
		return n+(functionalFindSumation(n-1));
	}

	public static void main(String[] args) {
		findSumation(7, 0);
		System.out.println(functionalFindSumation(7));
	}
}