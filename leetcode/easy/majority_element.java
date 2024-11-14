package leetcode.easy;

import java.util.Map;
import java.util.HashMap;

public record majority_element() {

	static int mooresVotingAlgo(int nums[]){
		int ele = nums[0];
		int cnt = 0;
		for(int i=0; i<nums.length; i++){
			if(cnt == 0){
				ele = nums[i];
			}
			else if(nums[i] == ele){
				cnt++;
			}
			else {
				cnt--;
			}
		}
		return ele;
	}

	static int majorityElements(int nums[]){
		Map<Integer, Integer> hashNums = new HashMap<>();
		int n = nums.length;

		for(int i=0; i<n ; i++){
			int value = hashNums.getOrDefault(nums[i], 0);
			hashNums.put(nums[i], value + 1);
		}

		for (Map.Entry<Integer, Integer> it : hashNums.entrySet()) {
			if(it.getValue() > (n/2) ){
				return it.getKey();
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int nums[] = {6,5,5};

		int num = majorityElements(nums);
		System.out.println("Majority element: "+ num);
		
		int num2 = mooresVotingAlgo(nums);
		System.out.println("Majority element: "+ num2);
	}
}
