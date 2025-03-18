package leetcode.medium;

public class longest_repeating_character_replacement {
	static int characterReplacement(String s, int k) {
        // initialising array instead of hashmap for 26 capital characters
		int[]  arr = new int[26];
		int maxlen = 0, max = 0;
		// making two pointer for sliding window right and left
		int left =0, right =0;

		while(right < s.length()){
			// increamenting the index of the character to keep the count
			arr[(s.charAt(right) - 'A')] ++;

			//checkking the character with max number of occurences
			max = Math.max(max, arr[s.charAt(right) - 'A']);

			//checking if current window is valid or not
			if(right - left + 1 - max > k){
				// if yes that means number of allowed replacements is going more
				// then we have to decreament character at left and push the pointer at right 
				arr[s.charAt(left) - 'A'] --;
				left++;
			}
			// calculating window size
			maxlen = Math.max(maxlen, right-left+1);
			right++;
		}
		return maxlen;
    }
	public static void main(String[] args) {
		String s = "AABABBA";
		int k = 1;
		System.out.println(characterReplacement(s, k));;
	}
}
