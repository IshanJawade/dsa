package leetcode.easy;

public class buy_sell_stocks {

	static int stocks_simple(int nums[]){
		int min = Integer.MAX_VALUE;  // assigns maximum possible value of integer
		int max = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]< min){
				min = nums[i];
			}
			if(nums[i] - min > max){
				max = nums[i] - min;
			}
		}
		return max;
	}

	static int stocks_opt(int nums[]){
		int maxPro = 0;
   		int minPrice = Integer.MAX_VALUE;
   		for (int i = 0; i < nums.length; i++) {
        	minPrice = Math.min(minPrice, nums[i]);
        	maxPro = Math.max(maxPro, nums[i] - minPrice);
    	}
    	return maxPro;
	}

	
	public static void main(String[] args) {
		int nums[] = {7,1,5,3,6,4};
		//int nums[] = {2,4,1};
		System.out.println(stocks_opt(nums));
		System.out.println(stocks_simple(nums));
	}
}
