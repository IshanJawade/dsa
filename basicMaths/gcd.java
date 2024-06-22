package basicMaths;

public class gcd {

	// Brutforce methods
	public static int findGCD(int a, int b){
		int gcd = 1;
		for(int i = 1; i <= (Math.min(a,b)); i++ ){
			if (a % i == 0 && a % i == 0){
				gcd = i;
			}
		}
		return gcd;
	}
	
	// Optimized method (it starts checking from the min number towards 1) Yeah... Maths!!!
	public static int OptFindGCD(int a, int b){
		int gcd = 0;
		for(int i= Math.min(a,b); i >= 1 ; i-- ){
			if (a % i == 0 && a % i == 0){
				gcd = i;
				break;
			} 
		}
		return gcd;
	}
	// Super Optimized Algorithm (Euclid's Algoritm)
	public static int EucOptFindGCD(int a, int b){
		while(a > 0 && b > 0){
			if( a > b ) a = a % b ;
			else b = b % a;
		}
		if ( a == 0) return b;
		return a;
	}

	public static void main(String[] args) {
		int a = 34;
		int b = 567; 
		System.out.println(findGCD(a, b));
		System.out.println(OptFindGCD(a, b));
		System.out.println(EucOptFindGCD(a, b));
	}
}
