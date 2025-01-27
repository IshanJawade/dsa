package slidingWindow;

public class max_sum_subarray {
	public static int maxSumSubarray(int[] arr, int k){
		int sum = 0;

		// create window 
		int i = 0, j = 0;
		while(j < k){
			sum = sum + arr[j];
			j++;
		}
		int max = sum;
		
		// sliding window through the array
		while(j < arr.length){
			sum = sum - arr[i];
			i++;
			sum = sum + arr[j];
			max = Math.max(max, sum);
			j++;
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {2,5,1,8,2,9,1};
		int windowSize = 3;
		int maxSum = maxSumSubarray(arr, windowSize);
		System.err.println(maxSum);

	}
}
