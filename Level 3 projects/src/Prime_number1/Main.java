package Prime_number1;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	


	public static boolean isPrime(int input, ArrayList<Integer> array) {
		
		int len = array.size();
		int upperLimit = (int) Math.sqrt((double)input);
		
		
		for (int p=0; p<len;p++) {
			if(array.get(p)>upperLimit) {
				break;
			}
			
			if (input % array.get(p) == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int count =1;
		System.out.println("how big should are limit be?");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		sc.close();
		ArrayList<Integer> Prime = new ArrayList<Integer>();
		Prime.add(2);
		
		for (int i = 3; i < limit-1; i+=2) {
			if(isPrime(i, Prime)) {
				Prime.add(i);
				count+=1;
				//System.out.println(i);
			}
		}
		System.out.println("I found " + count + " many primes!");
	}
	// how many prime numbers between 0 and 3000000
}
