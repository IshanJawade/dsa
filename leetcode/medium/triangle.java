package leetcode.medium;


import java.util.*;

public class triangle {

	public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;

        for(int i=0; i<triangle.size(); i++){
            int min = Integer.MAX_VALUE;
            for(int num: triangle.get(i)){
                min = Math.min(min, num);
                sum = sum + min;
            }
        }
        return sum;
    }
	public static void main(String[] args) {
		
	}
}
