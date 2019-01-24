package Calculator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("How many numbers do you want to use?");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] inputs = new int[len];
		
		
		System.out.println("Please input three number");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<len;i++) {
			inputs[i]=s.nextInt();	
		}
		s.close();
		
		float[] finput = new float[len];
		for(int i=0;i<len;i++) {
			 finput[i]= inputs[i];
		}
		
		int count =0;
		for(int j = 0; j<len-2; j++) {
			
		
		for(int i = 0; i<len; i++) {
			if(finput[(i+0)%len]+finput[(i+1)%len]==finput[(i+2+j)%len]) {
				System.out.println(inputs[(i+0)%len]+ "+" +  inputs[(i+1)%len] + "=" + inputs[(i+2+j)%len]);
				count +=1;
			}
		
		
			if(finput[(i+0)%len]*finput[(i+1)%len]==finput[(i+2+j)%len]) {
				System.out.println(inputs[(i+0)%len]+ "*" +  inputs[(i+1)%len] + "=" + inputs[(i+2+j)%len]);
				count +=1;
			}
		
		
			if(finput[(i+0)%len]-finput[(i+1)%len]==finput[(i+2+j)%len]) {
				System.out.println(inputs[(i+0)%len]+ "-" +  inputs[(i+1)%len] + "=" + inputs[(i+2+j)%len]);
				count +=1;
			}
		
		
			if(finput[(i+1)%len]-finput[(i+0)%len]==finput[(i+2+j)%len]) {
				System.out.println(inputs[(i+1)%len]+ "-" +  inputs[(i+0)%len] + "=" + inputs[(i+2+j)%len]);
				count +=1;
			} 
			
		
			if(finput[(i+0)%len]/finput[(i+1)%len]==finput[(i+2+j)%len]) {
				System.out.println(inputs[(i+0)%len]+ "/" +  inputs[(i+1)%len] + "=" + inputs[(i+2+j)%len]);
				count +=1;
			}
	
	
			if(finput[(i+1)%len]/finput[(i+0)%len]==finput[(i+2+j)%len]) {
				System.out.println(inputs[(i+1)%len]+ "/" +  inputs[(i+0)%len] + "=" + inputs[(i+2+j)%len]);
				count +=1;
			} 
		}
		}
		if(count==0) {
			System.out.print("Sorry couldn't match!");
		}
	}
}