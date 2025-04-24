package leetcode.easy;

public class count_largets_group {
    static int countLargestGroup(int n) {
        int[] sums = new int[37];   // 10^4 ~ 9999 max number can be 36

        // increment the index = sum of digits 
        for(int i=1; i<=n ; i++) {
            sums[digitSum(i)] ++;
        }

        int maximum = Integer.MIN_VALUE, count = 0;
        // if the number is greater than max, change max and count to 1
        for(int i: sums){
            if(i > maximum) {
                maximum = i;
                count = 1;
            // if number is same as what is max increment count 
            } else if (i == maximum) {
                count ++;
            }
        }
        return count;
    }

    static int digitSum(int n) {
        int sum = 0;
        while(n > 0){
            sum += n % 10; // adds the last digit in the sum
            n /= 10;    // delete the last digit from the number
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(countLargestGroup(n));
    }
}
