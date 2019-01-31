package scrap;

import java.awt.*;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please input string to be compressed: ");
		Scanner userInput = new Scanner(System.in);
		
		String secondStep = userInput.nextLine();
		
		
		English sent1 = new English(secondStep);
		System.out.println("what don't you like?");
		String thirdStep = userInput.nextLine();
		System.out.println("what should it be replaced with?");
		String fourthStep = userInput.nextLine();
		
		sent1.findWordAndReplace(thirdStep,fourthStep);
		userInput.close();
		
		
		
 
	}
}
