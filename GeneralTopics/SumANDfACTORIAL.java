package GeneralTopics;

import java.util.Iterator;

public class SumANDfACTORIAL {

	// Sum
	static void sum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + i;
		}
		System.out.println("Sum: " + s);
	}

	// Factorial
	static void fact(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			s = s * i;
		}
		System.out.println("Factorial: " + s);
	}

	public static void main(String[] args) {
		sum(5);
		fact(5);
	}

}
