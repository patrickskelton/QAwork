package singledesignpattern;

public class Math {
	static Math x;
	int i;
	private Math() {}
	public static Math createObject() {
		if(x==null) {
			x=new Math();
		}
		return x;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}
