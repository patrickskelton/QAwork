
package working_with_files_exercise;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		person Patrick = new person("Patrick","22","dev");
		person Rizi = new person("Rizi","22","dev");
		person Tom = new person ("Tom","22","dev");
		person Aiden = new person("Aiden","22","dev");
		person Ian = new person("Ian","26","dev");
		person Hati =new person("Hati","22","dev");
		ArrayList<person> list = new ArrayList<person>();
		list.add(Patrick);
		list.add(Rizi);
		list.add(Tom);
		list.add(Ian);
		list.add(Hati);
		list.add(Aiden);
		
	}
}
