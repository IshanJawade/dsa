package leetcode.medium;

import java.util.*;

public class longest_substring_without_rep_char {

	// sliding window solution
	static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() <= 0)
			 return 0;
		Set<Character> set = new HashSet<>();
		int max = Integer.MIN_VALUE;
		int left = 0;
		// convert string to char array
		char[] arr = s.toCharArray();
		// simple loop till the last element of array
		for(int right=0; right < arr.length; right++){
			// if current element is present in the array remove from left
			// untill the element is removed 
			while(set.contains(arr[right])){
				set.remove(arr[left]);
				left++;
			}
			// add the current element in the array and compare with the max variable
			set.add(arr[right]);
			max = Math.max(max, set.size());
		}
		return max;
	}
	// brut force solution (doesn't work in some cases)
	static int lengthOfLongestSubstringBrut(String s) {
			 // edge cases
			 if (s == null || s.length() <= 0)
			 return 0;
 
		 Set<Character> set = new HashSet<>();
		 int max = Integer.MIN_VALUE;
		 for (char ch : s.toCharArray()) {
 
			 if (set.contains(ch)) {
				 set.clear();
				 set.add(ch);
			 } else {
				 set.add(ch);
				 if (set.size() > max)
					 max = set.size();
			 }
		 }
		 return max;
	}
		public static void main(String[] args) {
			String s = "dwwkew";
			System.out.println(lengthOfLongestSubstringBrut(s));
	}
}
