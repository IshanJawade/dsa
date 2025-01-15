package leetcode.medium;

import java.util.*;

public class word_subset {
	static List<String> wordSubsets(String[] words1, String[] words2) {
		Map<Character,Integer> w2 = new HashMap<>();
		for (String str : words2) {
			
		}
	}
	public static void main(String[] args) {
		List<String> subset = new ArrayList<>();
		String[] words1 = {"amazon","apple","facebook","google","leetcode"};
		String[] words2 = {"e","o"};
		subset = wordSubsets(words1, words2);
		System.out.println(subset);
	}
}
