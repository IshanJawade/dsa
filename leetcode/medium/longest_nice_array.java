package leetcode.medium;

public class longest_nice_array {
    static int longestNiceSubarray(int[] nums) {
        int right = 1, left = 0, mid = 0;
        int count = 0, max = Integer.MIN_VALUE;
        while(right < nums.length){
            if((nums[mid] & nums[right]) == 0){
                count ++;
                max = Math.max(max, count);
                right++;
                mid++;
            } else {
                left = right;
                mid = right;
                count = 0;
                right ++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,8,48,10};
    }
}
