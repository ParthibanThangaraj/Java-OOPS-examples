package OOPS.Inheritance;

public class b01Multilevel extends a01Single02 {

	public void empRole() {
		System.out.println("DevOps");
	}

	public static void main(String[] args) {
		b01Multilevel b = new b01Multilevel();
		b.empRole();
		b.empid();
		b.empName();
	}

}
