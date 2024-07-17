package sorting;

public class selection_sort {

	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		// System.out.println("n: "+n); //debug
		int temp = 0; int min = 0;
		for(int i=0; i < n-1; i++){
			min = i;
			// System.out.println("arr[min]: "+arr[min]); //debug
			for(int j=i; j < n; j++){
				if(arr[j] < arr[min]) {
					min = j;
				}
				// System.out.println("arr[min]: "+arr[min]); //debug
			}
			temp = arr[i];
			// System.out.println("temp: "+temp+" arr[i]: "+arr[i]+" arr[min]: "+arr[min]); //debug
			arr[i] = arr[min];
			// System.out.println("temp: "+temp+" arr[i]: "+arr[i]+" arr[min]: "+arr[min]); //debug
			arr[min] = temp;
			// System.out.println("temp: "+temp+" arr[i]: "+arr[i]+" arr[min]: "+arr[min]); //debug
		}
		// System.out.println("");
		// System.out.println("");
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {13,46,24,52,20,9};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		selectionSort(arr);

		for (int i : arr) {
			System.out.print(i+" ");
		}
 	}
}


// Time Complexity: O(n)^2