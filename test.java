
public class test {

	public static int[] twoSum(int nums[], int target) {
		int arr[]={0,0};
		for (int i=0; i < nums.length; i++ ){
			for (int j=0; j < nums.length; j++ ){
                if(!(i==j)){
                    if (nums[i]+nums[j] == target){
                        arr[1] = i;
                        arr[0] = j;
				    }
                }
			}
		}
        return arr;
	}
	public static void main(String[] args) {
		int Nums[] = {1,3,5,6};
		int target = 9;
		int results[] = twoSum(Nums, target);
		for(int i: results){
			System.out.print(i);
		}
	}	
}