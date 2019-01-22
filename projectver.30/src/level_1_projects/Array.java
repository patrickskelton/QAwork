package level_1_projects;

public class Array {
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
	public static void main(String[]  args) {
		int[] list = new int[11];
		list[0]=3;
		list[1]=34;
		list[2]=32;
		list[3]=7;
		list[4]=23;
		list[5]=51;
		list[6]=90;
		list[7]=18;
		list[8]=73;
		list[9]=35;
		list[10]=0;
		for(int i=0;i<10;i++){
			System.out.println(operation(list[i],list[i+1],false));
		}
	}

}
