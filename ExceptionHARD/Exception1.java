package ExceptionHARD;

public class Exception1 {

	public static void main(String[] args) {

		try {
			System.out.println("1");
			int sum = 9 / 0;
			System.out.printf("2");
		} catch (ArithmeticException e) {
			System.out.println("9/0 Handled");
		
		} finally {
			System.out.printf("5");
		}

	}

}