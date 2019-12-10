package academy.learnprogramming;

public class Main {

	public static void main(String[] args) {

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = " + myMinFloatValue);
		System.out.println("Float maximum value = " + myMaxFloatValue);
//Double is recommended for Java
		// BigDecimal should be used for precision calculations, like currency
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value = " + myMinDoubleValue);
		System.out.println("Double maximum value = " + myMaxDoubleValue);

		int myIntValue = 5 / 2;
		float myFloatValue = 5f / 2f;
		double myDoubleValue = 5d / 2d;

		System.out.println("myIntValue:" + myIntValue);
		System.out.println("myFloatValue:" + myFloatValue);
		System.out.println("myDoubleValue:" + myDoubleValue);

		// challenge convert pounds to kg
		double pounds = 200d;
		double kilogramRatio = 0.45359237d;
		double kilogramTotal = pounds * kilogramRatio;
		System.out.println("That is " + kilogramTotal + " kilograms");

	}
}
