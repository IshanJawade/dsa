package leetcode.easy;

import java.util.*;

public class divide_array_equal_parts {

	static boolean divideArray(int[] nums) {
		int[] freq = new int[512];

		for(int i=0; i<nums.length; i++){
			freq[nums[i]] ++;
		}

		for(int i=0; i<nums.length; i++){
			if(freq[i] %2 != 0){
				return false;
			}
		}
		return true;
	}
	
	static boolean divideArrayBrut(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for(int num: nums){
			map.put(num, map.getOrDefault(num, 0)+1);
		}

		for(int count: map.values()){
			if(count % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums = {9,9,19,10,9,12,2,12,3,3,11,5,8,4,13,6,2,11,9,19,11,15,9,17,15,12,5,14,12,16,18,16,10,3,8,9,16,20,2,4,16,12,11,14,20,16,2,18,17,20,3,13,16,17,1,1,11,20,20,4};
		System.out.println(divideArray(nums));
	}
}