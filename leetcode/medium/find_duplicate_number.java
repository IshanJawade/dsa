package leetcode.medium;

import java.util.*;

public class find_duplicate_number {

	// floyed's algorithm to check cycles in the link list
	public static int findDuplicate(int[] nums){
		// initialize slow and fast pointers on first element
		int slow = nums[0];
		int fast = nums[0];

		// pushed slow by one step and fast by two steps
		do{
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while(slow != fast);

		// reset one of the pointers on the first element and push both of them by one
		fast = nums[0];
		while(slow != fast){
			slow = nums[slow];
			fast = nums[fast];
		} 
		// return one of the pointer should be pointing same element
		return slow;
	}
	
	// more faster because not using any complex data-structure
	public static int findDuplicate2(int[] nums){
		int[] hash = new int[nums.length];
		for(int i=0; i<nums.length; i++){
			if(hash[nums[i]] == 1){
				return nums[i];
			}
			hash[nums[i]] = 1;
		}
		return -1;
	}

	// bruteforce but works
	public static int findDuplicateBrut(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<nums.length; i++){
			if(set.contains(nums[i])){
				return nums[i];
			}
			set.add(nums[i]);
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		int result = findDuplicate(nums);
		System.out.println(result);
	}
}
