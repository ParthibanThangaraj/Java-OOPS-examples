package CollectionList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array4 {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();

// List - pre defined interface 

// li - user defined variable 

// new - allocate memory at ruun time 

// ArrayList - Pre defined Class 

		li.add(40);

		li.add(10);

		li.add(30);

		li.add(20);

		li.add(10);

		System.out.println(li);

// to print the length 

		int b = li.size();

		System.out.println(b);

// to print one by one 

		for (Integer i : li) {

			System.out.println(i);

		}

// to remove the common values not using remove method 

		Set<Integer> s = new HashSet();

		s.addAll(li);

		System.out.println(s);

// because Set not support duplicate 

// to count the duplicate values 

		System.out.println("Count the duplicate values:" + (li.size() - (s.size())));

	}

}