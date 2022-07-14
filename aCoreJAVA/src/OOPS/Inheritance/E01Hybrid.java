package OOPS.Inheritance;

public class E01Hybrid extends a01Single02 implements D01Multiple, D01Multiple00 {

	@Override
	public void empName() {
		System.out.println("adam");
	}
	
	@Override
	public void empid() {
		System.out.println("001");
	}

	@Override
	public void empAge() {
		System.out.println("28");
	}

	@Override
	public void phoneNumber() {
		System.out.println("1234567890");

	}

	public static void main(String[] args) {
		E01Hybrid h = new E01Hybrid();
		h.empName();
		h.empid();
		h.empAge();
		h.phoneNumber();

	}

}
