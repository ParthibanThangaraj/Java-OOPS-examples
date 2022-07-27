package OOPS.PolymorphismABSTRACTIONEncapsulation;

// Abstraction - hiding the implementation details (or) Business logic details
public abstract class c01AbstractPartial {

	public abstract void empID(); // abstract Methods

	public void empName() { // non - abstract methods
		System.out.println("empName: John");
	}

	public static void main(String[] args) {

		// c01AbstractPartial c = new c01AbstractPartial(); We can't create Object.
		// Contains Extend keyword to implement these methods.

	}
}
