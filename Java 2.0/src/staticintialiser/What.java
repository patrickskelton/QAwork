package staticintialiser;

public class What {
	static {
		System.out.println("unique");
	}
	int x;
	public void One() {
		int x;
		x=15;
		System.out.println(++x);
	}
	public void Two() {
		System.out.println(x);
	}
}
