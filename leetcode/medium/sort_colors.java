package leetcode.medium;

public class sort_colors {

	static void sortColors(int arr[]){
		int n = arr.length;
		int low = 0; int mid = 0; int high = n-1;
		while(mid <= high){
			if(arr[mid] == 0){
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}
			else if(arr[mid] == 1){
				mid++;
			}
			else {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,0,2,1,1,0};
		System.out.println("Array before sorting: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\nArray after sorting: ");
		sortColors(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
}