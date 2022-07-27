package CollectionList;

import java.util.ArrayList;
import java.util.List;

public class Array2CommonValuesRemoved {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();

		li.add(10);

		li.add(30);

		li.add(20);

		li.add(10);

		li.add(60);

		System.out.println("The List 1:" + li);

		List<Integer> ll = new ArrayList<>();

		ll.addAll(li);

		ll.add(80);

		ll.add(70);

		System.out.println("The List 2:" + ll);

// to remove the common values 

		ll.removeAll(li);

		System.out.println("The Common Values removed:" + ll);

	}

}