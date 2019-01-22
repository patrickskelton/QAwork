package unique_sum_exercise;

public class Main {
	public static int uniqueSum(int numberOne, int numberTwo, int numberThree) {
		if(numberOne==numberTwo) {
			if(numberOne==numberThree) {
				return 0;
			}
			else {
				return numberThree;
			}
		}
		else if (numberOne==numberThree) {
			return numberTwo;
		}
		else if (numberTwo==numberThree) {
			return numberOne;
		}
		else {
			return numberOne + numberTwo + numberThree;
		}
	}
	public static void main(String[] args) {
		System.out.println(uniqueSum(1,1,2)+uniqueSum(3,5,5)+uniqueSum(7,9,7));
	}
}
