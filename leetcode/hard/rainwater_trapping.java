package leetcode.hard;

public class rainwater_trapping {
	static int trap(int[] height) {
		int n = height.length;
		int[] maxLeft = new int[n];
		int[] maxRight = new int[n];
		int[] minLR = new int[n];

		// calculate max left
		int lmax = 0;
		for(int i=0; i<n; i++){
			if(height[i] > lmax) lmax = height[i];
			maxLeft[i] = lmax;
		}

		// calculate max right 
		int rmax = 0;
		for(int i=n-1; i>=0; i--){
			if(height[i] > rmax) rmax = height[i];
			maxRight[i] = rmax; 
		}

		// calculate minimum from maxLeft and maxRight
		for(int i=0; i<n; i++){
			minLR[i] = Math.min(maxLeft[i], maxRight[i]);
		}

		// water calculation
		int totalWater = 0;
		for(int i=0; i<n; i++){
			totalWater = totalWater + (minLR[i]-height[i]);
		}

        return totalWater;
    }
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int output = trap(height);
		System.out.println(output);
	}
}
