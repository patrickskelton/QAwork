package calculator2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	public static void main(String[] args) {
		Frame F = new Frame();
		GridLayout G = new GridLayout(4,1);
		F.setLayout(G);
		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("*");
		Button B4 = new Button("/");
		Math m = new Math();
		B1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent p) {
			
				
				m.setOperation("Addition");
			}	
		});
		B2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent p) {
				
				m.setOperation("Subtract");
			}	
		});
		B3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent p) {
				
				m.setOperation("Multiply");
			}	
		});
		B4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent p) {
				m.setOperation("Divide");
			}	
		});
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		F.setSize(200,400);
		F.setVisible(true);
	}
	
}
