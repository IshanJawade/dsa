package basics;
public class patterns {
    
	static void halfPyramid(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
	}

	static void invertedHalfPyramid(){
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}

	static void pyramid(){
        int num = 11; // only accepts odd numbers 
        
        int avg = (num+1) / 2;
    
        int l = avg,r = avg;

        System.out.println(num +" X "+ avg );

        for( int i=1; i <= avg; i++){
            for( int j=1; j <= num; j++){
                System.out.print((j == avg) || (j >= l && j <= r) ? "*" : " ");
            }
            l -=  1; r  +=  1;
            System.out.println();
        }

		}
		public static void main(String args[]){
				halfPyramid();
				invertedHalfPyramid();
				pyramid();
		}

}
