package slidingWindow;

import java.util.*;

public class first_negative_in_window {
	static int[] first_nagative_window(int[] arr, int k){
		ArrayList <Integer> negatives = new ArrayList<>();

		// create window
		int i=0, j=0;
		while(j < k){
			j++;
		}
		// sliding window through array
		while(j < arr.length){
			if(arr[i] < 0){
				negatives.add(arr[i]);
				i++;
				continue;
			} else {
				i++;
			}
		}

	}
	public static void main(String[] args) {
		int[] arr = {12,-1,-7,8,-15, 30,16,28};
		int windowSize = 3;
		int[] firstNegative = first_nagative_window(arr, windowSize);
		System.err.println(firstNegative);
	}
}
