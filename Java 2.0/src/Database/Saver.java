package Database;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Saver implements ActionListener {
	private TextField T1;
	private boolean t1=false;
	private boolean t2=false;
	private TextField T2;
	private TextField T3;
	private Label L4;
	
	private Label L6;
	public Saver(TextField A,TextField B, TextField C, Label D, Label F) {
		T1=A;
		T2=B;
		T3=C;
		L4=D;
		
		L6=F;
	}
	
	public void actionPerformed(ActionEvent p) {
		
		L4.setText("");
		L6.setText("");
		String str3=T3.getText();
		String sA = "";
		String sB =T2.getText();
		String sC ="";
		try {
			int A=Integer.parseInt(T1.getText());
			sA=T1.getText();
			t1=true;
			
		}catch(Exception e) {L4.setText("Unable to read that please put an integer in");
		t1=false;};
		try {
			int C=Integer.parseInt(str3);
			sC = T3.getText();
			t2=true;
		}catch(Exception e) {L6.setText("Unable to read please put an integer in");
		t2=false;};
		
		if(t1&&t2) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tablar","root","password");
			Statement statement = conn.createStatement();
			statement.executeUpdate("insert into school(region,name,mark) values("+sA+",'"+sB+"',"+sC+")");
			System.out.println("Worked succussfully");
			L6.setText("record added");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("didn't work");
		}}
		
		
		
	}
	
	
	
}

