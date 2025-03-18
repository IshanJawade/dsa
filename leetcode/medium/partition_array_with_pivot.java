package leetcode.medium;

import java.util.ArrayList;

public class partition_array_with_pivot {

    static int[] pivotArray(int[] nums, int pivot){
        int[] array = new int[nums.length];
        int left = 0, right = nums.length -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot) {
                array[left] = nums[i];
                left ++;
            } else if(nums[i] > pivot) {
                array[right] = nums[i];
                right --;
            }
        }
        while(left <= right){
            array[left] = pivot;
            left++;
        }
       return array;
    }

    static int[] pivotArrayBrut(int[] nums, int pivot) {
        ArrayList<Integer> equals = new ArrayList<>();
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == pivot) {
                equals.add(nums[i]);
            } else if(nums[i] < pivot) {
                less.add(nums[i]);
            } else if(nums[i] > pivot) {
                big.add(nums[i]);
            }
        }
        ArrayList <Integer> finalList = new ArrayList<>();
        finalList.addAll(less);
        finalList.addAll(equals);
        finalList.addAll(big);
        return finalList.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        int[] finalArray = pivotArray(nums, pivot);
        for (int i : finalArray) {
            System.out.print(i+" ");
        }
    }
}
