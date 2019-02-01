package calculator3;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operation implements ActionListener {
	private TextField T1;
	
	public Operation(TextField T){
		T1=T;
	}		
	public void actionPerformed(ActionEvent p) {
		Button BIN = (Button) p.getSource();
		String T = T1.getText();
		int A=0;
		
		try {
		A=Integer.parseInt(T);}catch(Exception e) {T1.setText("hmm sorry what was that?");}
		T1.setText("");
		if(Main.AccumulatorUsed) {
	
			
			
			
			
			
			if(Main.Accumulatoradd!=0) {
				A=Main.Accumulatoradd + A;
				Main.Accumulatoradd=0;
				Main.AccumulatorUsed=false;
			}
			if(Main.Accumulatorsub!=0) {
				
				A=Main.Accumulatorsub - A;
				Main.Accumulatorsub=0;
				Main.AccumulatorUsed=false;
				
			}
			if(Main.Accumulatortim!=0) {
				
				A=Main.Accumulatortim * A;
				Main.Accumulatortim=0;
				Main.AccumulatorUsed=false;
			}
			if(Main.Accumulatorsla!=0) {
				if(A!=0) {
					A=Main.Accumulatorsla / A;
					Main.Accumulatorsla=0;
				Main.AccumulatorUsed=false;
				}
				else {T1.setText("");
				Main.AccumulatorUsed=false;
			}
		}
			
			
			
			
			
			
			
		}
		
		if(BIN.getLabel().equals("+")) {
			Main.Accumulatoradd=A;
			Main.AccumulatorUsed=true;
		}
		else if(BIN.getLabel().equals("-")) {
			Main.Accumulatorsub=A;
			Main.AccumulatorUsed=true;
		}
		else if(BIN.getLabel().equals("*")) {
			Main.Accumulatortim=A;
			Main.AccumulatorUsed=true;
		}
		else if(BIN.getLabel().equals("/")) {
			Main.Accumulatorsla=A;
			Main.AccumulatorUsed=true;
		}
		
	}

}
