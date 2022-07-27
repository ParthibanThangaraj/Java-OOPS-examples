package OOPS.PolymorphismABSTRACTIONEncapsulation;

public class d01AbstractFully02 implements d01AbstractFully {

	@Override
	public void empId() {
		System.out.println("001");
	}

	@Override
	public void empName() {
		System.out.println("John");
	}

	public static void main(String[] args) {
		d01AbstractFully02 fa = new d01AbstractFully02();
		fa.empId();
		fa.empName();
	}

}
