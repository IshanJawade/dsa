package sorting;

public class insertion_sort {

	public static int[] insertionSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int a=1; a < n; a++) {
			int b = a;
			while ( b > 0 && (arr[b-1] > arr[b]) ) { 				
				temp = arr[b-1];
				arr[b-1] = arr[b];
				arr[b] = temp;
				b--;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {13,46,24,52,20,9};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		insertionSort(arr);
		System.out.println("");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}
