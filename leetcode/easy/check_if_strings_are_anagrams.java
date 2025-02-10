package leetcode.easy;

import java.util.*;

public class check_if_strings_are_anagrams {
	static boolean areAlmostEqual(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(!(arr1[i] == arr2[i])){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dcba";
		System.out.println(areAlmostEqual(s1, s2));
	}
}
