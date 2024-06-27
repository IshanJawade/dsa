package recurssion;

public class intro_recursion {

	static int count = 0;
	static int closedCount = 1;

	public static void prinT(){
		if (count == 3) return;
		count ++;
		System.out.println("Function ran "+ count +" times");
		prinT();
		// System.out.println("Closed "+ closedCount++);
	}
	public static void main(String[] args) {
		prinT();
	}
	
}
