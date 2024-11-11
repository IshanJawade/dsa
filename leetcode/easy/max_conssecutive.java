package leetcode.easy;

public class max_conssecutive {
	static int maxConsecutive(int nums[]){
		int max = 0;
		int cnt = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i] == 1){
				cnt++;
			} else {
				cnt = 0;

			}
			if(cnt > max){
				max = cnt;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int nums[] = {1,1,0,1,1,1,0,1};
		System.out.println(maxConsecutive(nums));
	}
}
