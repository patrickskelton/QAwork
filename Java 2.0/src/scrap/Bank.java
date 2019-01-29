package scrap;

public class Bank {
	static int dollar;
	public void amount(int A) {
		System.out.println("amoutn:"+(A*dollar));
		
	}
	public void setDollar(int A) {
		dollar=A;
	}
}
