package hashing;

public class frequency_char {
	static int findCharFrequency(String str, char c){
		int[] charHash = new int[27];
		int diff = 0;
		for(int i=0; i < str.length(); i++){
			diff = str.charAt(i) - 'a'; // finding ASCII value of the character and stored the diff
			charHash[diff]++;
		}
		diff = c - 'a';
		return charHash[diff];
	}
	public static void main(String[] args) {
		String str = "singiskinng";
		char c = 'g';
		System.out.println(findCharFrequency(str, c));
	}
}
