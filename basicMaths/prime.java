package basicMaths;

import java.util.ArrayList;
import java.util.List;

public class prime {
		
		// My method Time comlexity : O(1) 
		public static boolean checkPrime(int num){
			if (num==1) return false;
			if (!(num%2==0 || num%3==0 || num%5==0 || num%7==0 || num%13==0 || num%11==0 || num%17==0)){
				return true;
			}
			if (num==2 || num==3 || num==5 || num==7 || num==13 || num==11 || num==17 ){
				return true;
			}
			return false;
		}

		public static boolean OPTCheckPrime(int num){
			int cnt = 0;
			for(int i =1; i <= Math.sqrt(num); i++ ){
				if (num % i == 0){
					cnt ++;
					if (num/i != i){
						cnt++;
					}
				}
			}
			if (cnt == 2){
				return true;
			}
			return false;
		}

		public static void testPrime(){
			// int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
			int arr2[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 361, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 437, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 529, 541, 547, 551, 557, 563, 569, 571, 577, 587, 589, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 667, 673, 677, 683, 691, 701, 703, 709, 713, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 779, 787, 797, 809, 811, 817, 821, 823, 827, 829, 839, 841, 851, 853, 857, 859, 863, 877, 881, 883, 887, 893, 899, 907, 911, 919, 929, 937, 941, 943, 947, 953, 961, 967, 971, 977, 983, 989, 991, 997};

			for (int i: arr2){
				System.out.println(checkPrime(i));
			}
		}

		public static void findPrime(int num){
			List<Integer> primes = new ArrayList<>(); 
			for (int i=1; i <= num; i++){
				if(OPTCheckPrime(i)) primes.add(i);
			}
			System.out.println(primes);
			System.out.println(primes.size());
		}

		public static void main(String[] args) {
			System.out.println(OPTCheckPrime(23));
			// System.out.println("Running Test Prime method:");
			// testPrime();
			findPrime(1000);
		}
	}
