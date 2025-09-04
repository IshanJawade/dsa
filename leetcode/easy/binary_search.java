package leetcode.easy;

public class binary_search {

	// Micro optimization for very lucky edge cases
	// if(nums[left] == target) return left;
    // if(nums[right] == target) return right;
    // if(nums[mid] == target) return mid;


	// Actual Binary search logic
	static int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length -1;
		while(left <= right){
			int mid = left + (right - left) /2;

			if(nums[mid] == target) return mid;
			else if(target < nums[mid]) { 
				right = mid - 1;	// search left half
			} else {
				left = mid + 1; // search right half
			}
		}
		return -1;
	}

	// brut force (half the array) approach ... Still works !!!
	public int searchBrut(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (right - left) / 2;
        if(nums[left] == target) return left;
        if(nums[right] == target) return right;
        if(nums[mid] == target) return mid;
        if(target < nums[mid]) {
            left++;
            right = mid;
            while (left < right) {
                if(nums[left] == target) return left;
                else if(nums[right] == target) return right;
                left ++; right --;
            }
        }
        else {
            left = mid;
            while(left < right){
                if(nums[left] == target) return left;
                else if(nums[right] == target) return right;
                left ++; right --;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		System.out.println(search(nums, target));
	}
}