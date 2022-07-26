package OOPS.Inheritance;

public class D01Multiple01 implements D01Multiple, D01Multiple00 {

	@Override
	public void phoneNumber() {
		System.out.println("54455614");

	}

	@Override
	public void empAge() {
		System.out.println("26");
	}

	public static void main(String[] args) {
		D01Multiple01 d = new D01Multiple01();
		d.empAge();
		d.phoneNumber();
		

	}

}
