package leetcode.medium;

class rotate_array{

	static void rotate_brut(int arr[], int k) {
		int n = arr.length;
		k = k % n;
	
		int temp[] = new int[k];
		for (int a = 0; a < k; a++) {
			temp[a] = arr[n - k + a];
		}
	
		for (int i = n - k - 1; i >= 0; i--) {
			arr[i + k] = arr[i];
		}
	
		for (int j = 0; j < k; j++) {
			arr[j] = temp[j];
		}
	}
		
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;

		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		rotate_brut(arr, k);

		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}