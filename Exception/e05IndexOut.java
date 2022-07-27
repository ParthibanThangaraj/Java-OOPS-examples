package Exception;

import java.util.ArrayList;
import java.util.List;

public class e05IndexOut {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);//4
		
		System.out.println(li);

		System.out.println(li.get(5));
	}
}
