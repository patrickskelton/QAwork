package doggoCompotition;

import java.util.Scanner;
public class Placement {
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter your position: ");
		Scanner s = new Scanner(System.in);
		int place = s.nextInt();
		System.out.println("You finnished in position");
		
		
		String [] positions = new String[100];
		for(int i = 0; i < 100; i++) {
			String numberAsString = Integer.toString(i+ 1);
			positions[i] = numberAsString;
		}
		
		
		for(int i = 0; i < 100; i++) {
			if(i < place -1){
				if(i/10==1) {
					positions[i] = positions[i]+"th";
					continue;
				}
				
				
				
				else if(i % 10 == 0) {
					positions[i] = positions[i] + "st";
				}
				else if(i % 10 == 1) {
					positions[i] = positions[i] + "nd";
				}
				else if(i % 10 == 2) {
					positions[i] = positions[i] + "rd";
				}
				else {
					positions[i]= positions[i] + "th";
				}
			}
			else if(i == 99) {
				positions[i] = "";
			}
			else {
				if(i/10==1 && i % 10 ==9) {
					positions[i] = positions[i+1] + "st";
					continue;
				}
				else if (i/10==1) {
					positions[i] =positions[i+1] + "th";
					continue;
					}
					
					
				
				else if(i % 10 == 0) {
					positions[i] = positions[i + 1] + "nd";
				}
				else if(i % 10 == 1) {
					positions[i] = positions[i + 1] + "rd";
				}
				else if(i % 10 == 9) {
					positions[i] = positions[i + 1] + "st";
				}
				
				else {
					positions[i]= positions[i + 1] + "th";
				}
			}
						
		}
		
		for (int i = 0; i < 100; i++) {
			if(i%10==0 ) {
				System.out.println(positions[i]);
			}
			else {
				if(i/10==0) {
					System.out.print(" "+positions[i]+"  ");
				}
				else {
					System.out.print(" "+positions[i]+" ");
				}
			}
		}
	}
}
