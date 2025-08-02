package leetcode.medium;
import java.util.*;
public class bitwise_ors_subarray {
	static public int subarrayBitwiseORs(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			int or = 0;
			for(int j=i; j<arr.length; j++){
				or |= (arr[j]);
				set.add(or);
			}
		}
		return set.size();
    }
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6};
		System.out.println(subarrayBitwiseORs(arr));
	}
}
