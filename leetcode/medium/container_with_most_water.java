package leetcode.medium;

public class container_with_most_water {
	static int maxArea(int[] height) {
        int n = height.length;
		int maxHieght = 0;
		int currentHeight = 0;
		int left = 0; int right = n-1;
		while(left < right){
			currentHeight = Math.min(height[left], height[right]) * (right-left);
			if(maxHieght < currentHeight) maxHieght = currentHeight;
			if(height[left] < height[right]){
				left++;
			}else if(height[left] > height[right]) {
				right--;
			} else {
				left++;
			}
		}
		return maxHieght;
    }
	public static void main(String[] args) {
		int[] height = {8,7,2,1};
		int maxHeight = maxArea(height);
		System.out.println(maxHeight);
	}
}
