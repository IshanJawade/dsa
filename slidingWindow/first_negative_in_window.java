package slidingWindow;

import java.util.LinkedList;
import java.util.Queue;

public class first_negative_in_window {

	static int[] first_nagative_window(int[] arr, int k){
		int n = arr.length;
		int[] negatives = new int[(n - k)+1];
		Queue<Integer> queue = new LinkedList<>();

		//create window
		int i = 0, j = 0;
		int count = 0;
		
		while(j < k){
			if(arr[j] < 0){
				queue.add(arr[j]); // putting negative element in queue
			}
			j++;
		}

		// sliding window trought the array;
		while(j < n){
			// store first element in negatives
			if(!queue.isEmpty()){
				negatives[count] = queue.peek(); // peek gives first element in queue
			} else {
				negatives[count] = 0;
			}
			count++;

			// removing element from queue
			if(!queue.isEmpty() && queue.peek() == arr[i]){
				queue.poll(); // poll removes first element from queue FIFO
			}

			// add element if its negative
			if( arr[j] < 0){
				queue.add(arr[j]);
			}

			// slide the window forward
			i++;
			j++;
		}

		// handiling last window
		if(queue.isEmpty()){
			negatives[count] = 0;
		} else {
			negatives[count] = queue.peek();
		}
		return negatives;
	}

	static int[] firstNagativeWindowBrute(int[] arr, int k){
		// create array to store first negative numbers
		// formula: array size = size of given array - (window size + 1) 
		int[] negatives = new int[(arr.length - k)+1];
		int nptr = 0;

		// create window
		int i=0, j=0;
		while(j < k){
			j++;
		}
		// sliding window through array
		while(j < arr.length){
			int cnt = i;
			while(cnt != j){
				if(arr[cnt] < 0){
					negatives[nptr] = arr[cnt];
					nptr ++;
					break;
				}
				cnt++;
			}
			i++;
			j++;
		}
		// last window handling 
		int cnt = i;
		while(cnt != j){
			if(arr[cnt] < 0){
				negatives[nptr] = arr[cnt];
				nptr ++;
				break;
			}
			cnt++;
		}
		
		return negatives;
	}
	public static void main(String[] args) {
		int[] arr = {12,-1,-7,8,-15, 30,16,-28};
		int windowSize = 3;
		int[] firstNegative = firstNagativeWindowBrute(arr, windowSize);
		
		for (int i : firstNegative) {
			System.out.print(i + " ");
		}
		System.out.println("");

		firstNegative = first_nagative_window(arr, windowSize);
		
		for (int i : firstNegative) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}
