package level_1_projects;

import java.util.ArrayList;

public class Iteration2 {
	public static void main(String[] args) {
		ArrayList<Integer> loop = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			loop.add(i);
		}
		for(int stuff : loop) {
			System.out.println(stuff*10);
		}
	}

}
