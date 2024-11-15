package leetcode.medium;

public class rearrange_elemens_bysign {
	static int [] rearrage(int nums[]){
		int p = 0;
		int n = 1;
		int arr[] = new int[nums.length];
		for(int a=0; a<nums.length; a++){
			if(nums[a]>0){
				arr[p] = nums[a];
				p = p+2;
			} else {
				arr[n] = nums[a];
				n = n+2;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int nums[] = {3,1,-2,-5,2,-4};
		int arr[] = rearrage(nums);
		for (int i : arr) {
			System.out.print(i);
		}
	}
}
