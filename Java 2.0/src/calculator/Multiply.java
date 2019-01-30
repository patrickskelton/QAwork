package calculator;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiply implements ActionListener{
	Label L1 = new Label("first");
	TextField T1 = new TextField();
	Label L2 = new Label("second");
	TextField T2 = new TextField();
	Label L3 = new Label("");
	TextField T3 = new TextField();
	Label L4 = new Label("Result");
	Button B1 = new Button("+");
	
	
	public void actionPerformed(ActionEvent p) {
		Frame F = new Frame("Multiply");
		GridLayout G = new GridLayout(4,2);
		F.setLayout(G);
		
		Button B1 = new Button("=");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent p) {
				try {
				int in1 = Integer.parseInt(T1.getText());
				int in2 = Integer.parseInt(T2.getText());
				int in3=in1*in2;
				String result = Integer.toString(in3);
				T3.setText(result);}catch(Exception e) {
					T3.setText("What!!");
				}
			}
		});
		F.add(L1);
		F.add(T1);
		F.add(L2);
		F.add(T2);
		F.add(L3);
		F.add(B1);
		F.add(L4);
		F.add(T3);
		
		
		
		F.setSize(400,800);
		F.setVisible(true); 
		

	}
}