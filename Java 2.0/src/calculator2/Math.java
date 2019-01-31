package calculator2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Math extends Frame{
	TextField T1,T2,T3;
	Label L1,L2,L3,L4;
	Button B1;
	public Math() {
		GridLayout GL= new GridLayout(4,2);
		setLayout(GL);
		T1= new TextField();
		T2= new TextField();
		T3= new TextField();
		L1 = new Label("first No");
		L2 = new Label("second No");
		L3 = new Label("");
		L4 = new Label("Result");
		B1 = new Button();
		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(L3);
		add(B1);
		add(L4);
		add(T3);
		
		
		
		B1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent p) {
				String T=getTitle();
				int A,B;
				String C;
				A=Integer.parseInt(T1.getText());
				B=Integer.parseInt(T2.getText());
				
				if(T.equals("Addition")){
					C=String.valueOf(A+B);
					
					T3.setText(C);
				}
				else if(T.equals("Subtract")){
					C=String.valueOf(A-B);
					T3.setText(C);
				}
				else if(T.equals("Multiplly")){
					C=String.valueOf(A*B);
					T3.setText(C);
				}
				else if(T.equals("Divide")){
					C=String.valueOf(A/B);
					T3.setText(C);
				}
				
				
			}
		});
	}

	

	public void setOperation(String TT) {
		setTitle(TT);
		if(TT.equals("Addition")){
			B1.setLabel("+");
		}
		else if (TT.equals("Subtract")) {
			B1.setLabel("-");
		}
		else if (TT.equals("Multiply")) {
			B1.setLabel("*");
		}
		else if (TT.equals("Divide")) {
			B1.setLabel("/");
		}
		setSize(400,200);
		setVisible(true);

	}
}
