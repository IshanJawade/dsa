package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;

public class group_anagram {
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		findGroupAnagram(strs);
	}

	static boolean findGroupAnagram(String[] strs) {
		String[] sortedStrs = new String[strs.length];
		HashMap<String, Integer> Map1 = new HashMap<>();
		HashMap<String, Integer> Map2 = new HashMap<>();

		for (int a=0; a < strs.length; a++){
			char[] temp = strs[a].toCharArray();
			Arrays.sort(temp);
			sortedStrs[a] = temp.toString();
		}
		for (String string : sortedStrs) {
			System.out.println(string);
		}
		

		
		return true;
	}
}
