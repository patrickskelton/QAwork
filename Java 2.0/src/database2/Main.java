package database2;


import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;


public class Main {

	public static void main(String[] args) {


		Frame F = new Frame();
		GridLayout G = new GridLayout(4, 3);

		Label L1 = new Label("RegNo");
		Label L2 = new Label("Name");
		Label L3 = new Label("marks");
		Label L4 = new Label();
		Label L5 = new Label();
		Label L6 = new Label();
		F.setLayout(G);
		TextField T1 = new TextField(20);
		TextField T2 = new TextField(20);
		TextField T3 = new TextField(20);
		Button B1 = new Button("Save");
		Button B2 = new Button("Next");
		Next N = new Next(T1,T2,T3,L4,L5,L6,F);
		B2.addActionListener(N);
		F.add(L1);
		F.add(T1);
		F.add(L4);
		F.add(L2);
		F.add(T2);
		F.add(L5);
		F.add(L3);
		F.add(T3);
		F.add(L6);
		F.add(B2);
		F.setSize(800,400);
		F.setVisible(true);
	}}