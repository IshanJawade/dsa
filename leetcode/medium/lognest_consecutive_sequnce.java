package leetcode.medium;

import java.util.Arrays;

public class lognest_consecutive_sequnce {

	static int longestConsecutiveSequence(int nums[]){
		Arrays.sort(nums);
		int min = Integer.MIN_VALUE;
		int longest = 0;
		int cnt = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]-1 == min){
				cnt ++;
				min = nums[i];
			}
			else if(nums[i] != min){
				cnt = 1;
				min = nums[i];
			}
			longest = Math.max(cnt, longest);
		}
		return longest;
	}
	public static void main(String[] args) {
		int nums[] = {100, 200, 1, 3, 2, 4}	;
		System.out.println(longestConsecutiveSequence(nums));
	}
}
