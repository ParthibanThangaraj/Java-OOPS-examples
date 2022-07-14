package OOPS.PolymorphismABSTRACTIONEncapsulation;

public class b02OverRidingPOLY2 extends b01OverRidingPOLY {

	@Override
	public void redmi() {
		System.out.println("Redmi : Rs. 10,999");
	}

	@Override
	public void apple() {
		System.out.println("Apple : Rs. 99,000");
	}

	public void nokia() {
		System.out.println("BharKia : Rs. 22,00,000");
	}

	public static void main(String[] args) {
		b02OverRidingPOLY2 b = new b02OverRidingPOLY2();
		b.redmi();
		b.apple();
		b.nokia();

	}
}
