package Array;

import java.util.Vector;

public class a {

	public static void main(String[] args) {

		String s = "helloworld1234.62.2296aasdfg";
		char[] ch = s.toCharArray();

		boolean cont = s.contains(".");

//		s.substring(17, 19)

		System.out.println("is dot there? " + cont);

		int don = s.indexOf(".");
		
		System.out.println(don-1);
		System.out.println(don+1);
		
		String beast = s.substring(don-1, don+2);
		System.out.println(beast);

//		s.split(s);
//		System.out.println(s);

		Vector v = new Vector<>();
		Vector v1 = new Vector<>();

		StringBuilder sb1 = new StringBuilder();

		for (char c : ch) {
			if (Character.isDigit(c)) {
				v.add(c);
			}
		}

		for (char d : ch) {
			if (Character.isAlphabetic(d)) {
				v1.add(d);
			}
		}

		System.out.println();

		System.out.println(v);
		System.out.println("The Count of Numbers is: " + v.size());

		System.out.println(v1);
		System.out.println("The Count of Numbers is: " + v1.size());

	}

}
