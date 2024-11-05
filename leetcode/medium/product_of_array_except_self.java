package leetcode.medium;

public class product_of_array_except_self {

	// Brutforce methode
	static int[] BFproductOfArray(int[] nums) {
		int[] ans = new int[(nums.length)];
		for(int i=0; i < nums.length; i++){
			ans[i] = 1;
			for(int j=0; j < nums.length; j++){
				if(j != i){
					ans[i] = ans[i] * nums[j];
				}
			}
		}
		return ans;
	}

	//optimized method
	// static int[] productOfArray(int[] nums) {
		// int[] prefix = new int[nums.length]; int pre = 1;
		// int[] postfix = new int[nums.length]; int post = 1;
		// int[] output = new int[nums.length];
		// for(int i: nums){

		// }
		// return output;
	// }

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] answer = BFproductOfArray(nums);
		// int[] OPanswer = productOfArray(nums);
		for(int i : answer){
			System.out.println(i);
		}
		// for(int i : OPanswer){
		// 	System.out.println(i);
		// }
	}
}
