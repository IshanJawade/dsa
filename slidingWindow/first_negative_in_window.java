package slidingWindow;

public class first_negative_in_window {
	static int[] first_nagative_window(int[] arr, int k){
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
		return negatives;
	}
	public static void main(String[] args) {
		int[] arr = {12,-1,-7,8,-15, 30,16,28};
		int windowSize = 3;
		int[] firstNegative = first_nagative_window(arr, windowSize);
		
		for (int i : firstNegative) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}
