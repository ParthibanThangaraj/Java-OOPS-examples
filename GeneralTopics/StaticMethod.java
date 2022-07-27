package GeneralTopics;

public class StaticMethod {

	static int Cube(int a) {
//		int c = a * a * a;
		return a * a * a;
	}
	static int Square(int a) {
		return a * a;
	}

	public static void main(String[] args) {
//		int x = Cube(2);
		System.out.println("Cube= " + Cube(2));
		System.out.println("Cube= " + Cube(4));
		System.out.println("Square= " + Square(4));
	}
}
