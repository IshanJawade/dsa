package leetcode.medium;

import java.util.List;
import java.util.ArrayList;


public class word_subset {
	static List<String> wordSubsets(String[] words1, String[] words2) {
		List<String> subset = new ArrayList<>();
		int flag = 0;
		for(int j=0; j<words2.length; j++){
			char[] ch = words2[j].toCharArray();
			for(int i=0; i<ch.length; i++){
				String temp = "" + ch[i];
				flag = 0;
				for(int k=0; k<words1.length; k++){
					if(words1[k].contains(temp)){
						flag++;
					}
					if(flag == ch.length){
						subset.add(words1[k]);
					}
				}
			}
		}
		return subset;
	}
	public static void main(String[] args) {
		List<String> subset = new ArrayList<>();
		String[] words1 = {"amazon","apple","facebook","google","leetcode"};
		String[] words2 = {"e","o"};
		subset = wordSubsets(words1, words2);
		System.out.println(subset);
	}
}
