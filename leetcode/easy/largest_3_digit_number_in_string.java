package leetcode.easy;

public class largest_3_digit_number_in_string {

	static String largestGoodInteger(String num){

		// Small hashMap of only 1 entry
		int[] map = new int[2];
		char[] ch = num.toCharArray();
		int max = Integer.MIN_VALUE;

		for(char c : ch){
			int a = (int) c;
			if(a == map[0]){	// if a is already there just increase the count 
				map[1]++;
			} else {			// if a is not there put and count 1
				map[0] = a;
				map[1] = 1;
			}
			if(map[1] == 3){	// check if the count is 3
				max = Math.max(max, map[0]);	// then assign max number
			}
		}
		// if no Good Integer found
        if( max < 0) return "";

		// Create string of "max max max"
		char[] str = new char[3];
		for(int i=0; i<3; i++){
			str[i] = (char) max;
		}
		// this will return the char array into string
        return new String(str);
	}
	public static void main(String[] args) {
		String num = "6777133339";
		System.out.println(largestGoodInteger(num));
	}
}
