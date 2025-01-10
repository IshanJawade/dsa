package leetcode.medium;

import java.util.*;

public class three_sum {
	static List<List<Integer>> threeSum(int[] nums) {
		// sort the array
		Arrays.sort(nums);
		List<List<Integer>> trip = new ArrayList<>();
		int n = nums.length;
		for(int i=0; i<n; i++){
			// to handle duplicates 
			if(i>0 && nums[i] == nums[i-1]) continue;
			int j = i+1;	// pointer left
			int k = n-1;	// pointer right 
			while(j<k){
				int sum = nums[i] + nums[j] + nums[k];
				if(sum < 0){
					j++;
				} else if (sum > 0) {
					k --;
				} else {
					trip.add(Arrays.asList(nums[i], nums[j], nums[k]));
					while(j<k && nums[j] == nums[j+1]) j++;
					while(j<k && nums[k] == nums[k-1]) k--;
					// this is nessesory to do after while loops
					j++;
					k--;
				}
			}
		}
		return trip;
    }
	public static void main(String[] args) {
		int[] nums = {-2,0,1,1,2};
		List<List<Integer>> triplets = new ArrayList<>();
		triplets = threeSum(nums);
		System.out.println(triplets);
	}
}
