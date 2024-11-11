package leetcode.easy;

public class single_number {

	static int singleNumber(int nums[]){
		int xor = 0;

		for(int i = 0; i < nums.length; i++){
			xor = xor ^ nums[i];
		}

		return xor;
	}
	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}
}
