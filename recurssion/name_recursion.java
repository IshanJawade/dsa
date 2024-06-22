package recurssion;

public class name_recursion {

	public static void name(int i, int n) {
		if (i>n) return;
		System.out.println(i+": Ayushi");
		name(i+1, n);
	}
	public static void main(String[] args) {
		int n = 4;
		name(1, n);
	}
}
