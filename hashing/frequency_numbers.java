package hashing;

public class frequency_numbers {

	static int findFrequency(int n, int[] arr){
		int[] hash = new int[13];		// hash array
		for(int i=0; i<arr.length; i++){
			hash[arr[i]]++;				
		}
		return hash[n];
	}
	public static void main(String[] args) {
		int[] arr = {3,1,5,6,7,3,4,2,3,1,7,4,2};
		int num = 6;
		System.out.println(findFrequency(num, arr));
	}
}
