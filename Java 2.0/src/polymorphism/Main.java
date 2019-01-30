package polymorphism;

public class Main {
	public static void main(String[] args) {
		Circle x = new Circle();
		Line T = new Line();
		drawSomthing(x);
		drawSomthing(T);
	}
	
	public static void drawSomthing(Drawing ref) {
		ref.doDrawing();

	}
}