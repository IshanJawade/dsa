package leetcode.easy;

import java.util.*;

public class clear_digits {
	static String clearDigits(String s){
		// Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		char[] charS = s.toCharArray();
		// if current element is digit pop the stack 
		// if not push the element which is character in the stack
		for(char ch: charS){
			if(ch >= '0' && ch <= '9'){
				sb.deleteCharAt(sb.length() - 1);
			} else {
				sb.append(ch);
			}
		}
		s = sb.toString();
		return s;
	}
	public static void main(String[] args) {
		String s = "zabc367";
		System.out.println(clearDigits(s));
	}
}
