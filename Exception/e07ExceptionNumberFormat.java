package Exception;
public class e07ExceptionNumberFormat {

	public static void main(String[] args) {

		String s = "1234";

		System.out.println(s + 10);

		int a = Integer.parseInt(s); //1234

		System.out.println(a + 10);
		
		
		

		String s1 = "4567gfds";

		System.out.println(s1 + 10);

		int b = Integer.parseInt(s1);

		System.out.println(b + 10);

	}

}