package sorting;

// Called (Implemented) all sorting algorithms in single program

public class sorting {
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2,1};
		bubble_sort bObj = new bubble_sort();
		selection_sort sObj = new selection_sort();
		insertion_sort iObj = new insertion_sort();

		@SuppressWarnings("static-access")
		int[] bubble = bObj.bubbleSort(arr);
		System.out.println("Bubble Sort");
		for (int i : bubble) {
			System.out.print(i+" ");
		}
		System.out.println("");

		@SuppressWarnings("static-access")
		int[] selection = sObj.selectionSort(arr);
		System.out.println("Selection Sort");
		for (int i : selection) {
			System.out.print(i+" ");
		}
		System.out.println("");

		@SuppressWarnings("static-access")
		int[] insertion = iObj.insertionSort(arr);
		System.out.println("Insertion Sort");
		for (int i : insertion) {
			System.out.print(i+" ");
		}
		System.out.println("");

	}
}
