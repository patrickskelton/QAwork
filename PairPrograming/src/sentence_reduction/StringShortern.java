package sentence_reduction;

import java.util.Scanner;


public class StringShortern {

	public static void main(String[] args) {
		
		
		
		System.out.println("Please input string to be compressed: ");
		Scanner userInput = new Scanner(System.in);
		
		String secondStep = userInput.nextLine();
		
		userInput.close();
		String[][] inputarray = new String[100][100];
		String[] output = secondStep.split(" ");
				
		int len = output.length;
		
		for (int i = 0; i < len; i++) 
		{
			
			String[] anotherArray = output[i].split("");
			int size = anotherArray.length;
			for(int j=0;j<size;j++) {
				inputarray[i][j]=anotherArray[j];
				System.out.println(inputarray[i][j]);
			}
			
			
			
		}
		

	}

}
