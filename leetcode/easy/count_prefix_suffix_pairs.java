package leetcode.easy;

public class count_prefix_suffix_pairs {

	static int countPrefixSuffixPairs(String[] words) {
		int pair_count = 0;
		for(int i=0; i<words.length; i++){
			for(int j=i+1; j<words.length; j++){
				if( words[j].startsWith(words[i]) && words[j].endsWith(words[i]) ){
					pair_count ++;
				}
			}
		}
		return pair_count;
	}
	public static void main(String[] args) {
		String[] words = {"a","aba","ababa","aa"};
		int count = countPrefixSuffixPairs(words);
		System.out.println(count);
	}
}
