package OOPS.PolymorphismABSTRACTIONEncapsulation;

public class c01AbstractPartial02 extends c01AbstractPartial {

	@Override
	public void empID() {
		System.out.println("empid 001");
	}

	public static void main(String[] args) {

		c01AbstractPartial02 c = new c01AbstractPartial02();

		c.empID(); // given body from another class
		c.empName(); // used by inheritance

	}

}
