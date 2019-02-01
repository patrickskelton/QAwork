package database2;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Next implements ActionListener {
	private TextField T1;
	private TextField T2;
	private TextField T3;
	private Label L4;
	private Label L5;
	private Label L6;
	private boolean t1 = false;
	private boolean t2 = false;
	private ResultSet R;
	private Frame Fra;

	public Next(TextField A, TextField B, TextField C, Label D, Label E, Label F,Frame f) {
		T1 = A;
		T2 = B;
		T3 = C;
		L4 = D;
		L5 = E;
		L6 = F;
		Fra=f;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tablar", "root", "password");
			Statement statement = conn.createStatement();
			R = statement.executeQuery("Select * from school");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("didn't work");
		}

	}

	public void actionPerformed(ActionEvent p) {

		try {
			if (!(R.isLast())) {
				R.next();
				T1.setText(R.getInt(1) + "");
				T2.setText(R.getString(2));
				T3.setText(R.getInt(3) + "");
			}
			else {
				Fra.setTitle("This is the last record");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
