
public class exersice {
	
	public static int blackjack(int firstNumber, int secondNumber) {
		if (firstNumber>21 && secondNumber>21) {
			return 0;
		}
		else if (firstNumber>21 || secondNumber>21) {
			if(firstNumber>21) {
				return secondNumber;
			}
			else {
				return firstNumber;
			}
		}
		else {
			if(firstNumber > secondNumber) {
				return firstNumber;
			}
			else {
				return secondNumber;
			}
		}
		
	}
	
	
	
	
	public static int uniquesum(int firstNumber, int secondNumber,int thirdNumber) {
		if(firstNumber == secondNumber) {
			if(thirdNumber == secondNumber) {
				return 0;
			}
			else {
			return thirdNumber;
			}
		}
		else if(firstNumber == thirdNumber) {
			if(thirdNumber == secondNumber) {
				return 0;
			}
			else {
			return secondNumber;
			}
		}
		else if(secondNumber == thirdNumber) {
			if(firstNumber == secondNumber) {
				return 0;
			}
			else {
			return firstNumber;
			}
		}
		else {
			return firstNumber+secondNumber+thirdNumber;
		}
	}

	
	
	
	
	
	
	
}
