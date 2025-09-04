package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class pacles_triangle {
	private static List<List<Integer>> Generate(int n) {
		List<List<Integer>> res = new ArrayList<>();

		for(int i=0; i<n;i++){
			List<Integer> row = new ArrayList<>();

			for(int j=0; j<=i; j++){
				// first and last element should be 1 in any row
				if(j==0 || j==i){
					row.add(1);
				} 
				// adding first rows elemets to create new integer
				else {
					int val = res.get(i-1).get(j-1) + res.get(i-1).get(j);
					row.add(val);
				}
			}
			res.add(row);
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(Generate(n));
	}
}
