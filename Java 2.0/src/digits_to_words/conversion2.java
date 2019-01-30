package digits_to_words;

public class conversion2 {
	private static String ONES[] = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ",
			"ten ","eleve n","twelve ","thirteen ","fourtee ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
	private static String TY[] = {"","","Twenty ","Thirty ","Fourty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
	public static void digitsToWords(int No) {
		String Answer ="";
		if(No==0) {
			Answer+="zero";
		}
		if(No>=1000) {
			Answer+=ONES[No/1000]+"Thousand ";
			No-=(No/1000)*1000;
			}
		if(No>=100) {
			Answer+=ONES[No/100]+"Hundred ";
			No-=(No/100)*100;
			}
		if(No>=20) {
			Answer+=TY[No/10];
			No-=(No/10)*10;
			}
		if(0<No&& No<20) {
			Answer +=  ONES[No];
		}
		System.out.println(Answer);
	}
}