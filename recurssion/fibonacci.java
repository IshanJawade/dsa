package recurssion;

public class fibonacci {

	public static void createFibonacci(int n){
		int sum = 0;
		int x = 0;
		int y = 0;
		for(int i=0; i<n; i++){
			if(i == 0) System.out.print(" "+i);
			else if(i == 1){
				System.out.print(" "+i);
				x = 1;
				y = 0;
			} else {
				sum = x+y;
				y = x;
				x = sum;
				System.out.print(" "+sum);
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int n = 10; 
		createFibonacci(n);
	}
}
