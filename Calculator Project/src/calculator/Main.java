package calculator;

import java.awt.*;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

	public static void main(String[] args) {
		
		
		
		
		Frame F = new Frame("Basic Calculator");
		
		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("/");
		Button B4 = new Button("*");
		
		GridLayout G = new GridLayout(4,1);
		F.setLayout(G);
		Addition A = new Addition();
		B1.addActionListener(A);
		Subtract S = new Subtract();
		B2.addActionListener(S);
		Multiply M = new Multiply();
		B4.addActionListener(M);
		Divide D = new Divide();
		B3.addActionListener(D);
		
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		
		
		
		F.setSize(400,800);
		F.setVisible(true); 
	}
}