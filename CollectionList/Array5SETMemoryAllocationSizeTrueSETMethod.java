package CollectionList;

import java.util.HashSet;
import java.util.Set;

public class Array5SETMemoryAllocationSizeTrueSETMethod {

	public static void main(String[] args) {

		Set<Character> s = new HashSet();

		s.add('A');

		s.add('a');

		s.add('7');

		s.add(' ');

		s.add(')');

		System.out.println(s);

// to find the allocated memory of a character ( 32) 

		char a = ' ';

		int b = a;

		System.out.println(b);

// to find the allocated memory of a character ( 32) 

		char c = ')';

		int d = c;

		System.out.println(d);

// to find the allocated memory of a character ( 32) 

		char e = '7';

		int f = e;

		System.out.println(f);

// to find the allocated memory of a character ( 32) 

		char g = 'A';

		int h = g;

		System.out.println(h);

// to find the allocated memory of a character ( 32) 

		char i = 'a';

		int j = i;

		System.out.println(j);

	}

}