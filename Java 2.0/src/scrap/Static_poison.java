package scrap;

public class Static_poison {
	static int x;
	public static void hello() {
		System.out.println("hello world");
	}
	public static void Go() {
		x++;
		System.out.println(x);
	}
}
