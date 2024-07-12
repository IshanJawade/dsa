package hashing;
import java.util.HashMap;
import java.util.Map;

public class frequency_numbers {

	// HashMap implementation 
	static int hashMapFrequency(int n, int[] arr){
		Map<Integer, Integer> numHashMap = new HashMap<> ();
		for(int i = 0; i < arr.length; i++){
			if(numHashMap.containsKey(arr[i])){
				numHashMap.put(arr[i], numHashMap.get(arr[i])+1);
			} else {
				numHashMap.put(arr[i],1);
			}
		}
		System.out.println(numHashMap);
		return numHashMap.get(n);
	}

	// Array implementation
	static int findFrequency(int n, int[] arr){
		int[] hash = new int[13];		// hash array
		for(int i=0; i<arr.length; i++){
			hash[arr[i]]++;				
		}
		return hash[n];
	}
	public static void main(String[] args) {
		int[] arr = {3,1,5,6,7,3,4,2,3,1,7,4,2};
		int num = 1;
		// called array method
		System.out.println(findFrequency(num, arr));
		// called HashMap mathod
		System.out.println(hashMapFrequency(num, arr));
	}
}
