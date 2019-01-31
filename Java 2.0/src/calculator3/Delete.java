package calculator3;


import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Delete implements ActionListener {
	private TextField T1;
	public Delete(TextField T){
		T1=T;
	}	
	
	
	public void actionPerformed(ActionEvent p) {
		T1.setText("");
		
	}
}
