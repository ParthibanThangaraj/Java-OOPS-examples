package Array;

import java.util.Iterator;

public class a01SingleDim {

	public static void main(String[] args) {

// Datatype variablename [ ] = new Datatype [size]; 
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 11;
		a[2] = 20;
		a[3] = 30;
		a[4] = 40;
// to find the length 
		int b = a.length;
		System.out.println(b);

// to get all particular value 
		System.out.println(a[2]);
		System.out.println("For Loop");
// to get all the value 
// 1 1<5 0+1=1 
		for (int i = 0; i < a.length; i++) {
// a[1] 
			System.out.println(a[i]);
		}

		System.out.println("Enhanced For Loop");
		for (int i : a) {
			System.out.println(i);
		}

	}

}