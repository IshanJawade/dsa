package sorting;

public class bubble_sort {

	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		boolean breakTheLoop = true;		// optimization
		while (n != 0) { 				
			for(int i = 0; i < n - 1; i++) {
				if(arr[i] > arr[i+1]){
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					breakTheLoop = false;	// optimization 
				}
			}
			if(breakTheLoop){				// optimization
				break;
			}
			n --; 
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {13,46,24,52,20,9};
		// int[] arr1 = {9,13,20,24,46,52};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
		bubbleSort(arr);

		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}
