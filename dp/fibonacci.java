package dp;

import java.util.*;

public class fibonacci {


///////////////////// Using Regular DP ////////////////////////////////////////////////
	int solve(int n, List<Integer> dp){
		if(n <= 1) return n;

		if(dp.get(n) != -1) {
			return dp.get(n);
		}

		int ans = solve(n-1, dp) + solve(n-2, dp);

		dp.add(n, ans);

		return ans;
	}

	int fib(int n){
		if(n <= 1){		// lowest possible valid value of parameter
			return n;	
		}
		// creating an array of n-1 size
		List<Integer> dp = new ArrayList<>(Collections.nCopies(n+1, -1));
		/*
		 can also use simple int[] 
		 */

		return solve(n, dp);
	}

///////////////////////// Linear Space Optimized Approach ////////////////////////////////

	public int fibo(int n){
		int a = 0;
		int b = 1;
		int c = 0;

		for(int i=1; i<n; i++){
			c = b + a;
			a = b;
			b = c;
		}
		return b;
	}


///////////////////////// Regular Reccursion /////////////////////////////////////////////
	
	int fibRegular(int n){
		if(n <= 1){		// lowest possible valid value of parameter
			return n;	
		}
		return fibRegular(n-1) + fibRegular(n-2);
	}

}
