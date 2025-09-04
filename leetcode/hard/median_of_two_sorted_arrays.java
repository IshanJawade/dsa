package leetcode.hard;

import java.util.*;

public class median_of_two_sorted_arrays {

	// Bruteforce solution works fine 
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> nums3 = new ArrayList<>();

		int n1 = nums1.length;
		int n2 = nums2.length;

		int i=0, j=0;

		while(i < n1 && j < n2){
			if(nums1[i] <= nums2[j]){
				nums3.add(nums1[i]);
				i++;
			} else {
				nums3.add(nums2[j]);
				j++;
			}
		}
		
		// to merge all remaining elemnts 
		while (i < nums1.length) nums3.add(nums1[i++]);
		while (j < nums2.length) nums3.add(nums2[j++]);

		// Find median
		int n = nums3.size();
		if(n % 2 == 1){		// if the length is ODD
 			return (double) nums3.get(n/2);		// return the middle elemets according to index
		} else {
			return ( (double) nums3.get((n/2)) + (double) nums3.get((n-1)/2) ) / 2.0;
		}
    }

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
