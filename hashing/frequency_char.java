package hashing;

import java.util.HashMap;

public class frequency_char {

	static int hashMapCharFrequency(String str, char c){
		HashMap <Character, Integer> charHash = new HashMap<>();
		for(int i=0; i < str.length(); i++){
			if(charHash.containsKey(str.charAt(i))){
				charHash.put(str.charAt(i), charHash.get(str.charAt(i))+1);
			} else {
				charHash.put(str.charAt(i), 1);
			}
		}
		System.out.println(charHash);	// print whole HashMap
		System.out.println(charHash.get('s')); // it takes key as a input and gives value as a output
		return charHash.get(c);
	}

	// Array implementation
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
		char c = 'n';
		System.out.println(findCharFrequency(str, c));
		System.out.println(hashMapCharFrequency(str, c));
	}
}
