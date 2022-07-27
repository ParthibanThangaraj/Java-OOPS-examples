package Exception;
public class e02ExceptionNullPointer {

	public static void main(String[] args) {

		String s = null;
//					 01234
		String s1 = "Akash";

		System.out.println("s: "+System.identityHashCode(s));
		System.out.println("s1: "+System.identityHashCode(s1));

		System.out.println(s1.charAt(2));
		System.out.println(s.charAt(2));

	}

}