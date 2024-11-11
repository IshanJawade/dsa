package leetcode.easy;

public class move_zeros {

	static void moveZeros(int nums[]){
		if(nums.length == 1){
			return;
		}
		int len = nums.length;
		int cnt = 0;
		int temp[] = new int[len];
		for(int i=0; i<len; i++){
			if(nums[i] != 0){
				temp[cnt] = nums[i];
				cnt ++; 
			}
		}
		for(int i=cnt; i<len ;i++){
			temp[i] = 0;
		}
		for(int i=0; i<len; i++){
			nums[i] = temp[i];
		}
	}
	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		moveZeros(nums);
		for (int i : nums) {
			System.out.print(i +" ");
		}
	}
}