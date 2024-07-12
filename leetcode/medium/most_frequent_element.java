package leetcode.medium;

import java.util.HashMap;

public class most_frequent_element {

	// HashMap Implementation
	static int findHashMostFrequentElement(int[] arr){
		HashMap<Integer, Integer> numTreeMap = new HashMap<>();
		for(int i=0; i < arr.length ; i++){
			if(numTreeMap.containsKey(arr[i])){
				numTreeMap.put(arr[i], numTreeMap.get(arr[i])+1);
			} else {
				numTreeMap.put(arr[i], 1);
			}
		} 
		System.out.println();

		int maxEle = 0; int minEle = 0;
		int maxVal = 0; int minVal = 0;
		for(HashMap.Entry<Integer, Integer> entry : numTreeMap.entrySet()){
			int count  = entry.getValue();
			int element = entry.getKey();
			if (count > maxVal) {
                maxEle = element;
                maxVal = count;
            }
            if (count < minVal) {
                minEle = element;
                minVal = count;
            }
		}
		System.out.println(maxEle+minEle);
		return 0;
	}

	// Array Implementation
	static int findMostFrequentElement(int[] arr){
		// pre-computation
		int[] hash = new int[13];
		int max = 0;
		for(int i: arr){
			hash[arr[i]]++;
			if(max < hash[i]){
				max = hash[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 7, 2, 8, 2, 1, 2};
		findHashMostFrequentElement(arr);
	}
}
