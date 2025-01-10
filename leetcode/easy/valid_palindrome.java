package leetcode.easy;

import java.util.*;

class valid_palindrome{

	static boolean isPalindrome(String s) {
		for(int i=0; i < s.length(); i++){
			if(s.charAt(i))
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		boolean solution = isPalindrome(str);
		System.out.println(solution);
	}
}