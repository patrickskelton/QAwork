package rock_paper_scissors;

import java.util.Scanner;
import java.util.Random;
public class Main {
	private static boolean playagain;
	private static boolean tryagain;
	private static int wincount =0;
	private static int losecount=0;
	private static int drawcount=0;
	public static boolean check() {
		
		
		do {
			System.out.println("Do you want to play rock paper scissors Enter Yes or No " + "\n" 
		+ "wins:" + wincount  + " losest:" + losecount + " draws: "+ drawcount); ;
			Scanner sc = new Scanner(System.in);
			String userinput = sc.nextLine();
			userinput= userinput.toUpperCase();
			
			if(userinput.equals("YES")) {
				playagain=true;
				tryagain=false;
			}
			else if (userinput.equals("NO")) {
				playagain =false;
				tryagain=false;
				
			}
			else {
				System.out.println("Invalid input");
				tryagain=true;
			}
			}while(tryagain==true);
		return playagain;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		boolean gameOn=false;
		int real =0;
		
		while(check()) {
		do {
		
		
		System.out.println("Let's play the game please input 1 for ROCK, 2 for SCISSORS, 3 for PAPER");
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		real = value;
		switch(value) {
		case 1:
		 gameOn=true;
			break;
		
		case 2 :
			 gameOn=true;
			break;
		case 3 :
			 gameOn=true;
			break;
		default : 
			System.out.println("invalid input");
			 gameOn=false;
			break;
		
		}
		}
		while(gameOn==false);
		
		
			int guess =new Random().nextInt(3);
			guess = guess +1;
		switch(guess) {
			case 1 : System.out.println("Computer guessed ROCK");
			break;
			case 2 : System.out.println("Computer guessed SCISSORS");
			break;
			case 3 : System.out.println("Computer guessed PAPER");
			break;
			default : System.out.println("Computer doesn't want to play");
			break;
		}
		if(real==1 && guess==1) {
			System.out.println("DRAW");
			drawcount +=1;
		}
		else if (real==1 && guess==2) {
			System.out.println("You win!");
			wincount +=1;
		}
		else if (real==1 && guess==3) {
			System.out.println("You Lose!");
			losecount +=1;
		}
		else if (real==2 && guess==1) {
			System.out.println("You Lose!");
			losecount +=1;
		}
		else if (real==2 && guess==2) {
			System.out.println("Draw!");
			drawcount +=1;
		}
		else if (real==2 && guess==3) {
			System.out.println("You win!");
			wincount +=1;
		}
		else if (real==3 && guess==1) {
			System.out.println("You win!");
			wincount +=1;
		}
		else if (real==3 && guess==2) {
			System.out.println("You Lose!");
			losecount +=1;
		}
		else  {
			System.out.println("Draw!");
			drawcount +=1;
		}
		
		}
		System.out.println("thanks for playing");

	}

}