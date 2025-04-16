package leetcode.easy;

public class count_symmetric_integer {
    static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int num = low; num <= high; num++){
            String str = Integer.toString(num);

            // if string length is odd skip the number
            if(str.length()%2 != 0) continue; 
            
            int mid = str.length() / 2;
            int sumLeft = 0;
            int sumRight = 0;

            for(int i = 0; i < mid; i++){
                sumLeft = sumLeft + (str.charAt(i) - '0');
            }

            for(int i = mid; i < str.length(); i++){
                sumRight = sumRight + (str.charAt(i) - '0');
            }
            
            if(sumLeft == sumRight){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int low = 1200;
        int high = 1230;
       System.out.println(countSymmetricIntegers(low, high));
    }
}
