package Prime_number1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class Main {

	
	public static boolean isPrime(int input, ArrayList<Integer> array) {

		int len = array.size();
		int upperLimit = (int) Math.sqrt((double) input);

		for (int p = 0; p < len; p++) {

			if (array.get(p) > upperLimit) {
				break;
			}

			if (input % array.get(p) == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int count = 1;
		System.out.println("how big should are limit be?");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		
		sc.close();
		long startTime = System.nanoTime();
		
		boolean[] primes = new boolean[limit+1];
		Arrays.fill(primes, true);
		
		
		ArrayList<Integer> Prime = new ArrayList<Integer>();
		
		Prime.add(2);
		
		primes[1]=true;
		
		for (int i = 3; i < limit - 1; i += 2) {
			if(primes[i]) {
			if (isPrime(i, Prime)) {
				Prime.add(i);
				count += 1;
				primes[i]=true;
				 if(primes[i]) {
			            for (int j=2;i*j<(primes.length);j++) {
			                primes[i*j]=false;}}}
			
				
				// System.out.println(i);
			}
		}
		System.out.println("I found " + count + " many primes!");
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		System.out.println("in this time "+ duration/1000000000 + " seconds");
	}
	// how many prime numbers between 0 and 3000000
}
