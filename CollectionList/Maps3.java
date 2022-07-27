package CollectionList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps3 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();

// to insert the value 

		m.put(10, "java");

		m.put(30, "selenium");

		m.put(20, "Manual testing");

		m.put(20, "Automation testing");

		m.put(50, "java");

		System.out.println(m);

// 1. to print key & value pair combination 

		Set<Entry<Integer, String>> f = m.entrySet();

		System.out.println(f);

		for (Entry<Integer, String> e : f) {

			System.out.println(e.getKey());

			System.out.println(e.getValue());

		}

	}

}