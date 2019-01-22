package blackjack_exercise;

public class Main {
	public static int blackjack(int numberOne, int numberTwo) {
		if(numberOne >0 && numberTwo >0) {
			if(numberOne>21 && numberTwo >21) {
				return 0;
			}
			else if (numberOne >21) {
				return numberTwo;
			}
			else if (numberTwo >21) {
				return numberOne;
			}
			else {
				if(numberOne>numberTwo) {
					return numberOne;
				}
				else {
					return numberTwo;
				}
			}
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(blackjack(2,21)+blackjack(0,3));
	}

}
