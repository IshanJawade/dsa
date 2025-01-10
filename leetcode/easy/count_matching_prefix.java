package leetcode.easy;

public class count_matching_prefix {
	static int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0; i<words.length; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		String[] words = {"pay","attention","practice","attend"};
		String pref = "at";
		int count = prefixCount(words, pref);
		System.out.println(count);
	}
}
