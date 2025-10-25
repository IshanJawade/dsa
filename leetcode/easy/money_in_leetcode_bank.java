package leetcode.easy;

public class money_in_leetcode_bank {
	
    static public int totalMoney(int n) {
        int bal = 0;
        if(n <= 7){ 
            for(int i=1; i<=n; i++){
                bal += i;
            }
        }
        else{

            int rem = n % 7;
            int weeks = n / 7;
            for(int i = 1; i<=weeks; i++){
                int j=i, count=1;
                while(count < 8){
                    bal += j;
                    j++; count++;
                }

            }
            // bal += (weeks+1);
            for(int i=1; i<=rem; i++){
                bal += (weeks)+i;
            }
        }
        return bal;
    }

	public static void main(String[] args) {
		System.out.println(totalMoney(20));
	}
}
