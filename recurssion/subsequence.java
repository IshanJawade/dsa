package recurssion;

import java.util.*;

public class subsequence {
	
	static void giveSubSquence(int ind, ArrayList<Integer> list, int[] nums, int n){
		// edge cases
		if(ind >= n){
			System.out.println(list);
			return;
		}
		if(n == 0) System.out.println("{}");

		// Take or pick the perticular index
		list.add(nums[ind]);
		giveSubSquence(ind+1, list, nums, n);
		
		// Not pick or not take perticular index
		list.removeLast();
		giveSubSquence(ind+1, list, nums, n);
	}
	public static void main(String[] args) {
		int[] nums = {3,1,2};
		int n = nums.length;
		ArrayList <Integer> list = new ArrayList<>();
		giveSubSquence(0, list, nums, n);
	}
}
