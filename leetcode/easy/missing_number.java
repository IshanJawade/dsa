package leetcode.easy;

public class missing_number {

	static int missing_number_opt(int arr[]){
		int xor1 = 0;
		for(int i=1; i<=arr.length; i++){
			xor1 = xor1 ^ i;
		}
		int xor2 = 0;
		for(int i=0; i<arr.length; i++){
			xor2 = xor2 ^ arr[i];
		}
		return xor1^xor2;
	}

	static int missingNumberBetter(int arr[]){
		int n = arr.length;
		int sum = (n*(n+1))/2;
		int sum2 = 0;
		for(int i=0; i< arr.length; i++){
			sum2 = sum2 + arr[i];
		}
		return sum - sum2;
	}

	static int missingNumber(int arr[]){
		int h_size = arr.length+1;
		int hash[] = new int[h_size];
		
		for(int i=0; i<arr.length; i++){
			hash[arr[i]] = 1;
		}

		for (int i=0; i < hash.length; i++) {
			if(hash[i] == 0){
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = {9,6,4,2,3,5,7,0,1};

		System.out.println("Missing number is: "+ missingNumber(arr));
		System.out.println("Missing number is: "+ missingNumberBetter(arr));
		System.out.println("Missing number is: "+ missing_number_opt(arr));
	}
}
