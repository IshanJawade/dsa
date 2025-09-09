package recurssion;

import java.util.ArrayList;

public class subsequqnce_sum {

	static void findSequenceSum(int ind, int[] nums, int n, ArrayList <Integer> list, int sum, int s){

		if(ind == n){
			if(sum == s) {
				System.err.println(list);
				return;
			}
			return;
		}
		// take
		list.add(nums[ind]);
		findSequenceSum(ind+1, nums, n, list, sum + nums[ind], s);

		// not take
		list.removeLast();
		findSequenceSum(ind+1, nums, n, list, sum + nums[ind], s);
	}
	public static void main(String[] args) {
		int[] nums = {1,2,1};
		int s = 2;
		int sum = 0;
		int n = nums.length;
		ArrayList<Integer> list = new ArrayList<>();
		findSequenceSum(0, nums, n, list, sum, s);
	}
}
