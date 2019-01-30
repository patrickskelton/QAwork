package digits_to_words;

public class conversion {
	public static void digitsToWords(int input) {
		if(input>=0 && input<10000) {
		int thousand=input/1000;
		int hundred=(input-thousand*1000)/100;
		int ten=(input-(thousand*1000+hundred*100))/10;
		int unit=(input-(thousand*1000+hundred*100+ten*10));
		number(thousand);
		if(thousand>0) {
			System.out.print("thousand ");
		}
		number(hundred);
		if(hundred>0) {
			System.out.print("hundred ");
			
		}
		if(ten==1) {
			System.out.print("and ");
			teens(unit);
			
		}
		else {
			System.out.print("and ");
			tens(ten);
			
			number(unit);
			if(unit==0 && hundred==0 && thousand==0 && ten==0) {
				System.out.println("zero");
			}
		}}else {
			System.out.println("incorrect input!");
		}
		
		
		
		
		
	}
		public static void number(int input) {
			switch(input) {
			
			case 1: System.out.print("one ");
			break;
			case 2: System.out.print("two ");
			break;
			case 3: System.out.print("three ");
			break;
			case 4: System.out.print("four ");
			break;
			case 5: System.out.print("five ");
			break;
			case 6: System.out.print("six ");
			break;
			case 7: System.out.print("seven ");
			break;
			case 8: System.out.print("eight ");
			break;
			case 9: System.out.print("nine ");
			break;
			default :
			break;
		}
	}
		public static void tens(int input) {
			switch(input) {
			
			case 2: System.out.print("twenty ");
			break;
			case 3: System.out.print("thirty ");
			break;
			case 4: System.out.print("fourty ");
			break;
			case 5: System.out.print("fifty ");
			break;
			case 6: System.out.print("sixty ");
			break;
			case 7: System.out.print("seventy ");
			break;
			case 8: System.out.print("eighty ");
			break;
			case 9: System.out.print("ninety ");
			break;
			default :
			break;
		}
	}
		public static void teens(int input) {
			switch(input) {
			case 0 : System.out.println("ten");
			break;
			case 1: System.out.print("eleven");
			break;
			case 2: System.out.print("twelve");
			break;
			case 3: System.out.print("thirteen");
			break;
			case 4: System.out.print("fourteen");
			break;
			case 5: System.out.print("fifteen");
			break;
			case 6: System.out.print("sixteen");
			break;
			case 7: System.out.print("seventeen");
			break;
			case 8: System.out.print("eighteen");
			break;
			case 9: System.out.print("nineteen");
			break;
			default :
			break;
		}
	}
}
