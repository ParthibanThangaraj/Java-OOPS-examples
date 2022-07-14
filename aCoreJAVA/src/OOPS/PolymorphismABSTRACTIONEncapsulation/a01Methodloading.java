package OOPS.PolymorphismABSTRACTIONEncapsulation;

//			Object Created and Calling Methods

public class a01Methodloading { // Public Class Created

	public void empId() { // Method Created
		System.out.println("01");
		System.out.println("02");
	}

	public void empName() { // 2
		System.out.println("Aakash");
		System.out.println("Kumar");

	}

	public static void main(String[] args) { // main method

		a01Methodloading e = new a01Methodloading(); // Object Created

		e.empId(); // Method called
		e.empName(); // ""
	}
}
