package OOPS.PolymorphismABSTRACTIONEncapsulation;

public class a02MethodOverlaodingPOLY {

	public void empDet(int empID, int empCode) { // Method Created With Parameters
		System.out.println("empID " + empID + " empCode" + empCode);
	}

	public void empDet(String empName, String empLocation) { // 2
		System.out.println("empName " + empName + " empLocation " + empLocation);
	}

	public void empDet(int a, String b) {
		System.out.println("a is: " + a + "b is : " + b);
	}

	public static void main(String[] args) {

		a02MethodOverlaodingPOLY o = new a02MethodOverlaodingPOLY(); // Object Created

//		o.empDet(1, 2); // method Overloaded based on parameters
//		o.empDet("John", "Chennai");// Same Method Name , with different Parameters.
		o.empDet(12, "adam");

	}
}
