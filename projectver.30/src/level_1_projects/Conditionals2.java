package level_1_projects;

public class Conditionals2 {
	public static int operation(int numberOne, int numberTwo, boolean status) {
		if(numberOne==0) {
			return numberTwo;
		}
		else if(numberTwo==0) {
			return numberOne;
		}
		else {
		if(status) {
			return numberOne + numberTwo;
		}
		else {
			return numberOne*numberTwo;
		}
		}
	}
	public static void main(String[] args) {
		System.out.println(operation(3,0,true));
	}
}
