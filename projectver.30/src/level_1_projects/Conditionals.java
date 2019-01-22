package level_1_projects;

public class Conditionals {
	public static int operation(int numberOne, int numberTwo, boolean status) {
		if(status) {
			return numberOne + numberTwo;
		}
		else {
			return numberOne*numberTwo;
		}
	}
	public static void main(String[] args) {
		System.out.println(operation(3,54,true));
	}
}
