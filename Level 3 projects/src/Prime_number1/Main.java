package Prime_number1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static int len = 1;

	public static boolean isPrime(int input, ArrayList<Integer> array) {
		
		len = array.size();

		for (int p : array) {
			if (input % p == 0) {
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
		System.out.println("I found " + count + " this many primes!");
	}
	// how many prime numbers between 0 and 3000000
}
