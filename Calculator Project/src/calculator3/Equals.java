package calculator3;


import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Equals implements ActionListener {
	private TextField T1;
	int B=0;
	int C=0;
	public Equals(TextField T){
		T1=T;
	}		
	public void actionPerformed(ActionEvent p) {
		String T = T1.getText();
		try {
		B=Integer.parseInt(T);}
		catch(Exception e) {T1.setText("what was that");}
		T1.setText("");
		if(!Main.AccumulatorUsed) {T1.setText(T);}
		if(Main.Accumulatoradd!=0) {
			C=(Main.Accumulatoradd+B);
			T1.setText(String.valueOf(C));
			Main.Accumulatoradd=0;
			Main.Accumulatorsub=0;
			Main.Accumulatortim=0;
			Main.Accumulatorsla=0;
			Main.AccumulatorUsed=false;
		}
		if(Main.Accumulatorsub!=0) {
			C=(Main.Accumulatorsub-B);
			T1.setText(String.valueOf(C));
			
			Main.Accumulatoradd=0;
			Main.Accumulatorsub=0;
			Main.Accumulatortim=0;
			Main.Accumulatorsla=0;
			Main.AccumulatorUsed=false;
			
		}
		if(Main.Accumulatortim!=0) {
			C=(Main.Accumulatortim*B);
			T1.setText(String.valueOf(C));
			
			Main.Accumulatoradd=0;
			Main.Accumulatorsub=0;
			Main.Accumulatortim=0;
			Main.Accumulatorsla=0;
			Main.AccumulatorUsed=false;
		}
		if(Main.Accumulatorsla!=0) {
			if(B!=0) {
			C=(Main.Accumulatorsla/B);
			T1.setText(String.valueOf(C));
			
			Main.Accumulatoradd=0;
			Main.Accumulatorsub=0;
			Main.Accumulatortim=0;
			Main.Accumulatorsla=0;
			Main.AccumulatorUsed=false;
			}
			else {T1.setText("");
			
		}
		
		}
	}

}