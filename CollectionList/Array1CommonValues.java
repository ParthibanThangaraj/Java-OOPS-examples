package CollectionList;

import java.util.ArrayList;
import java.util.List;

public class Array1CommonValues {

	public static void main(String[] args) {

		List l1 = new ArrayList<>();

		l1.add(10);
		l1.add(30);
		l1.add(20);
		l1.add(10);
		l1.add(60);
		l1.add("Hi");
		l1.add(33.55);

		System.out.println(l1.size());

		System.out.println("The List 1:" + l1);

		List<Integer> l2 = new ArrayList<>();

		l2.addAll(l1);

		l2.add(80);
		l2.add(70);

		System.out.println("The List 2:" + l2);

// to return the common values 

		l2.retainAll(l1);

		System.out.println("The Common Values of List 1 and 2:" + l2);

	}

}