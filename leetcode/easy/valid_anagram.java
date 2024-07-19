package leetcode.easy;

import java.util.Arrays;

public interface valid_anagram {

	// using hashing
	static boolean findAnagram(String s, String t) {
		int[] sHash = new int[27];
		int[] tHash = new int[27];

		if(s.length() != t.length()) return false;

		for(int i=0; i < s.length(); i++){
			int pos = s.charAt(i) - 'a'; 
			sHash[pos] = sHash[pos] + 1;
		}
		for(int i=0; i < t.length(); i++){
			int pos = t.charAt(i) - 'a'; 
			tHash[pos] = tHash[pos] + 1;
		}
		for(int i=0; i<27; i++){
			if(sHash[i] != tHash[i]){
				return false;
			}
		}
		return true;
	}

	//brut force
	
	public static boolean isAnagram(String s, String t) {

		if(s.length() != t.length()) return false;

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		Arrays.sort(sChar);
		Arrays.sort(tChar);

		return Arrays.equals(sChar, tChar);
	}

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "nagaram";

		System.out.println(findAnagram(str1, str2));
		System.out.println(isAnagram(str1, str2));
	}
}
