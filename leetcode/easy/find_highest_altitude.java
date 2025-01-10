package leetcode.easy;

public class find_highest_altitude {
    static int largestAltitude(int[] gain) {
			int sum = 0;
			int high = 0;
			for(int i=0; i<gain.length; i++){
				sum = sum + gain[i];
				high = Math.max(sum, high);
			}
			return high;
	}
	public static void main(String[] args) {
		int[] nums = {-5,1,5,0,-7};
		int highest = largestAltitude(nums);
		System.out.println(highest);
	}
}
