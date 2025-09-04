package leetcode.medium;
import java.util.*;
public class koko_eating_bananas {
	public static int minEatingSpeed(int[] piles, int h) {
         // check if the array is not empty
		if(piles.length == 0) return 0;

		int left = 1;
		int right = Arrays.stream(piles).max().getAsInt();
		int ans = right;
		
		// loop till 1 to the max (Binary Search)
		while(left != right){
		    int hours = 0;
			int mid = left + (right - left) / 2;	// calculate mid in every iteration

			for(int pile: piles){
				hours = hours + (pile + mid -1) / mid;	//ceiling division trick
			}

			if(hours <= h){		
				ans = mid;
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return ans;
    }
	
	public static void main(String[] args) {
		int[] piles = {3,6,7,11};
		int h = 8;
		System.out.println(minEatingSpeed(piles, h));
	}
}
