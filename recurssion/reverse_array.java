package recurssion;

public class reverse_array {
	static int[] rev;

	//print array function
	public static void printArray(int[] Array){
		for(int i: Array){
			System.err.println(i);
		}
	}
	// two pointer swap method
	public static void reverse(int[] num) {
		int p1 = 0; int p2 = num.length - 1;
		int temp;
		for(int i=0; i < (num.length)/2; i++){
			temp = num[p1];
			num[p1] = num[p2];
			num[p2] = temp;
			p1++;
			p2--;
		}
		printArray(num);
	}

	// Recursive method
	public static void arrayReverse(int[] arr) {
		
	}

	public static void main(String[] args) {
		int[] arr = {98, 90, 35, 76};
		reverse(arr);
	}
}
