package CollectionList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps1 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();

// to insert the value 

		m.put(10, "java");

		m.put(30, "selenium");

		m.put(20, "Manual testing");

		m.put(20, "Automation testing");

		m.put(50, "java");

		System.out.println(m);

// to find the length 

		int a = m.size();

		System.out.println(a);

// to check the particular key is present or not 

		boolean b = m.containsKey(40);

		System.out.println(b);

// to check the particular key is present or not 

		boolean c = m.containsValue("java");

		System.out.println(c);

// to get the particular value 

		String d = m.get(20);

		System.out.println(d);

// 1. to print key alone 

		Set<Integer> e = m.keySet();

		System.out.println("Keyset" + e);

// to print keys one by one 

		for (Integer i : e) {

			System.out.println("Keyset: "+i);

		}

// 2. to print values alone 

		Collection<String> j = m.values();

		System.out.println(j);

// to print values one by one 

		for (String s : j) {

			System.out.println(s);

		}

	}

}