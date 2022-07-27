package CollectionList;

import java.util.ArrayList;
import java.util.List;

public class Array2 {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList();

// List - pre defined interface 

// li - user defined variable 

// new - allocate memory at run time 

// ArrayList - Pre defined Class 

		li.add(20);

		li.add(30);

		li.add(40);

		li.add(50);

		li.add(90);

		li.add(20);

		System.out.println("FIRST :"+li);

// to find the particular value 

		Integer b = li.get(3); // 0 1 2 3 4

		System.out.println("Particular Value: "+b);

// to check the list is empty or not\ 

		boolean c = li.isEmpty();

		System.out.println("Is Empty: "+c);

		li.add(80);

		li.add(50);

		li.add(60);

		li.add(10);

		System.out.println(li);

// to add specific value 

		li.add(2, 60);

		System.out.println(li);

// to replace the particular value 

		li.set(2, 600);

		System.out.println(li);

// to remove the particular value present or not 

		Integer k = li.remove(2);

		System.out.println(li);

		System.out.println(k);

//to find the particular value present or not 

		boolean l = li.contains(40);

		System.out.println(l);

// to find the index position 

		int j = li.indexOf(50);

		System.out.println(j);

		int m = li.lastIndexOf(50);

		System.out.println(m);

	}

}