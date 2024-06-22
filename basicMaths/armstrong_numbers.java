package basicMaths;

public class armstrong_numbers {

	private static boolean findArmstrongNumber(int num) {
		int numCtr = (int) (Math.log10(num)+1);
		int sum = 0;
		int tmpNum = num;
		for(int i = 0; i < numCtr; i++){
			while(tmpNum != 0){
				sum = sum + (int) (Math.pow((tmpNum % 10), 3));
				tmpNum = tmpNum / 10;
			}
		}
		if (sum == num) return true;
		return false;
		
	}
	public static void main(String[] args) {
		System.out.println("The give number is Armstrong number: "+findArmstrongNumber(153));
		System.out.println("The give number is Armstrong number: "+findArmstrongNumber(371));
		System.out.println("The give number is Armstrong number: "+findArmstrongNumber(123));
	}

}
