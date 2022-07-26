package CollectionList;

import java.util.ArrayList;
import java.util.List;

public class Array3PrintOneByOneValues {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();

		li.add(10);

		li.add(30);

		li.add(20);

		li.add(10);

		li.add(60);

		System.out.println("The List 1:" + li);

		for (int i = 0; i < li.size(); i++) {

// to get the values 

// li.get(2) 

			System.out.println(li.get(i));

		}

	}

}