package leetcode.medium;

public class two_sum_ii {

	static int[] twoSumOpt(int[] numbers, int target){
		int[] result = {0,0};
		int left = 0;
		int right = numbers.length-1;

		while(left < right){
			if(numbers[left] + numbers[right] < target){
				left++;
			}
			if(numbers[left] + numbers[right] > target){
				right--;
			}
			if(numbers[left] + numbers[right] == target){
				result[0] = left+1; 
				result[1] = right+1;
				break;
			}
		}

		return result;
	}

	static int[] twoSum(int[] numbers, int target) {
		int[] result = {0,0};
        for(int i=0; i<numbers.length; i++){
			for(int j=i+1; j<numbers.length; j++){
				if(numbers[i]+numbers[j] < target){
					continue;
				}
				if(numbers[i]+numbers[j] > target){
					break;
				}
				if(numbers[i]+numbers[j] == target){
					result[0] = i+1; 
					result[1] = j+1;
				}

			}
		}
		return result;
    }
	public static void main(String[] args) {
		int[] numbers = {2,3,4};
		int target = 6;
		int[] result = twoSumOpt(numbers, target);
		System.out.println(+result[0]+" "+result[1]);
	}
}
