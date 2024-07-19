package leetcode.easy;

import java.util.HashMap;

public class constrain_duplicate {

		public static boolean containsDuplicate(int[] nums) {
			HashMap<Integer, Integer> hash = new HashMap<>();
			boolean flag = false;
			for(int i=0; i< nums.length; i++){
				if(hash.containsKey(nums[i])){
					flag = true;
					break;
				}
				else{
					hash.put(nums[i], 0);
				}
			}
			return flag;
		}
		
	public static void main(String[] args) {

		int[] nums = {1,2,3,4};
		System.out.println(containsDuplicate(nums));
	}
}
