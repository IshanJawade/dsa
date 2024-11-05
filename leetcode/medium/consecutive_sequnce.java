package leetcode.medium;

public class consecutive_sequnce {
	static void consecutiveSequnce(int[] arr) {
		
		for(int i: arr){
			int hash[i] = i;
		}
		System.out.println(hash);
	}

	public static void main(String[] args) {
		int[] arr = {100,4,200,1,3,2};
		consecutiveSequnce(arr);
	}
}

