package leetcode.easy;

public class count_elements_with_maximum_frequency {

	public static int maxFrequencyElements(int[] nums) {
        int[] fr = new int[101];
        int max = 0;

        for(int i=0; i<nums.length; i++){
            fr[nums[i]]++;
            max = Math.max(max, fr[nums[i]]);
        }

        int count = 0;
        for(int i=1; i<fr.length; i++){
            if(fr[i] == max){
                count++;
            }
        }

        return count*max;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,2,3,1,4};
		System.out.println(maxFrequencyElements(nums));
	}
}
