package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class two_sum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int arr[]={0,0};
		for (int i=0; i < nums.length; i++ ){
            if(hm.containsKey(target - nums[i])){
                arr[0] = i;
                arr[1] = hm.get(target - nums[i]);
            } else {
                hm.putIfAbsent(nums[i], i);
            }
		}
        return arr;
    }

	public static void main(String[] args) {
		int Nums[] = {1,3,5,6};
		int target = 9;
		int results[] = twoSum(Nums, target);
		System.out.printf("[%d, %d]",results[0],results[1]);
		System.out.println();
	}	
}
