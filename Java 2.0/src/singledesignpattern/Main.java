package singledesignpattern;

public class Main {
	public static void main(String[] arg) {
		Math A=Math.createObject();
		
		A.setI(12);
		Math B=Math.createObject();
		B.setI(23);
		Math C=Math.createObject();
		C.setI(150);
		System.out.println(A.getI()+B.getI()+C.getI());
		
	}
}
