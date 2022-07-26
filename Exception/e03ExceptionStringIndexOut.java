package Exception;
public class e03ExceptionStringIndexOut {

	public static void main(String[] args) {
//					012345
		String s = "Greens";

		System.out.println(System.identityHashCode(s));

		System.out.println(s.charAt(2));

		System.out.println(s.charAt(10)); // Error: StringIndexOutOfBoundsException

	}

}