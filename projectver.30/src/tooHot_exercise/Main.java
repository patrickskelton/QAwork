package tooHot_exercise;

public class Main {
	public static boolean tooHot(int temperature,boolean isSummer) {
		if(isSummer) {
			if(temperature>=60 && temperature<=100) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if(temperature>=60 && temperature<=90) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(tooHot(55,true));
		
	}
}
