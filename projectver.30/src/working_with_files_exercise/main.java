package working_with_files_exercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Main {
	public static void main(String[] args) {
		
		person Patrick = new person("Patrick","22","constultant");
		person Rizi = new person("Rizi","22","constultant");
		person Tom = new person ("Tom","22","constultant");
		person Aiden = new person("Aiden","22","constultant");
		person Ian = new person("Ian","26","constultant");
		person Hati =new person("Hati","22","constultant");
		ArrayList<person> list = new ArrayList<person>();
		ArrayList<String> list2 = new ArrayList<String>();
		list.add(Patrick);
		list.add(Rizi);
		list.add(Tom);
		list.add(Ian);
		list.add(Hati);
		list.add(Aiden);
		int len = list.size();
		
		try {
			FileWriter fw = new FileWriter("file_exercise.txt");
			PrintWriter pw = new PrintWriter(fw);
			for(int i=0;i<len;i++) {
				pw.println(list.get(i).toString());
				
			}
			pw.close();
		}
		catch(IOException e) {
			System.out.println("Error! Help!!!");
		}
		try {
			File file = new File("file_exercise.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				list2.add(sc.nextLine());
			}
			sc.close();
		}
		catch(IOException e) {
			System.out.println("OH NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		}
	}
}