package calculator3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;


public class Main {
	public static int Accumulatoradd;
	public static int Accumulatorsub;
	public static int Accumulatortim;
	public static int Accumulatorsla;
	public static boolean AccumulatorUsed=false;
	public static void main(String[] args) {
		
	Frame F = new Frame();
	Panel P1 = new Panel();
	Panel P2 = new Panel();
	Button B0 = new Button("0");
	Button B1 = new Button("1");
	Button B2 = new Button("2");
	Button B3 = new Button("3");
	Button B4 = new Button("4");
	Button B5 = new Button("5");
	Button B6 = new Button("6");
	Button B7 = new Button("7");
	Button B8 = new Button("8");
	Button B9 = new Button("9");
	TextField T1 = new TextField(50);
	T1.setText("");
	Button plus = new Button("+");
	Button minus = new Button("-");
	Button times = new Button("*");
	Button slash = new Button("/");
	Button equal = new Button("=");
	Button delete = new Button("C");
	Numbers N= new Numbers(T1);
	B0.addActionListener(N);
	B1.addActionListener(N);
	B2.addActionListener(N);
	B3.addActionListener(N);
	B4.addActionListener(N);
	B5.addActionListener(N);
	B6.addActionListener(N);
	B7.addActionListener(N);
	B8.addActionListener(N);
	B9.addActionListener(N);
	Operation O = new Operation(T1);
	plus.addActionListener(O);
	minus.addActionListener(O);
	times.addActionListener(O);
	slash.addActionListener(O);
	
	Delete C = new Delete(T1);
	delete.addActionListener(C);
	Equals E = new Equals(T1);
	equal.addActionListener(E);
	
	GridLayout G = new GridLayout(4,4);
	P2.setLayout(G);
	P2.add(B1);
	P2.add(B2);
	P2.add(B3);
	P2.add(plus);
	P2.add(B4);
	P2.add(B5);
	P2.add(B6);
	P2.add(minus);
	P2.add(B7);
	P2.add(B8);
	P2.add(B9);
	P2.add(times);
	P2.add(delete);
	P2.add(B0);
	P2.add(equal);
	P2.add(slash);
	P1.add(T1);
	F.add(P1,BorderLayout.NORTH);
	F.add(P2,BorderLayout.CENTER);
	
	F.setSize(400,400);
	F.setVisible(true);
	
	}
}


