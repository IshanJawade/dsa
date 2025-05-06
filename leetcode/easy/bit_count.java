package leetcode.easy;

import java.util.*;

public class bit_count {
	public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }
	public static void main(String[] args) {
		int n = 5;
		bit_count obj = new bit_count();
		int[] ans = obj.countBits(n);
		for(int i: ans) System.out.println(i + " ");
	}
}
