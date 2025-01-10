package leetcode.easy;

public class merge_strings_alternatively {
	static String mergeAlternately(String word1, String word2) {
		int loop_count = Math.max(word1.length(), word2.length());
        String merge = "";
        for(int i=0; i<loop_count; i++){
            if(i<word1.length()){
                merge = merge + word1.charAt(i);
            }
            if(i<word2.length()){
                merge = merge + word2.charAt(i);
            }
        }
        return merge;
    }
	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "pqr";
		String merged_string = mergeAlternately(word1, word2);
		System.out.println(merged_string);
	}
}
