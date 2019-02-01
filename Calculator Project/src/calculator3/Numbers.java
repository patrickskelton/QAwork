package calculator3;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Numbers implements ActionListener {
	private TextField T1;
	public Numbers(TextField T){
		T1=T;
	}		
	public void actionPerformed(ActionEvent p) {
		Button BIN = (Button) p.getSource();
		String T = T1.getText()+BIN.getLabel();
		T1.setText(T);
	}

}
