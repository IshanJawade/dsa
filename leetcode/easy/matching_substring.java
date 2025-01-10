package leetcode.easy;

import java.util.*;

public class matching_substring {

	static List<String> stringMatching(String[] words){
		List<String> answer = new ArrayList<>();
		for(int i=0; i<words.length; i++){
			for(int j=0; j<words.length; j++){
				if(i == j){ 
					continue; 
				}
				if (words[i].contains(words[j]) && !answer.contains(words[j])){
					answer.add(words[j]);
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] words = {"leetcoder","leetcode","od","hamlet","am"};
		List<String> machingWords = new ArrayList<>();
		machingWords = stringMatching(words);
		for (String str : machingWords) {
			System.out.print(str+ ", ");
		}
	}
}
