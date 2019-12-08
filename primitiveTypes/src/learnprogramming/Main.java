package learnprogramming;

public class Main {

	public static void main(String[] args) {
// Int
		int myValue = 10000;
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Min:" + myMinIntValue);
		System.out.println("Integer Max:" + myMaxIntValue);
		System.out.println("Busted max:" + (myMaxIntValue + 1));

		int myMaxIntTest = 2_147_483_647; // This is another way of writing numbers
//Byte
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Min:" + myMinByteValue);
		System.out.println("Byte Max:" + myMaxByteValue);
//Short
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("short Min:" + myMinShortValue);
		System.out.println("short Max:" + myMaxShortValue);
//Long
		long myLongValue = 100L; // long literals need l at the end

		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Min:" + myMinLongValue);
		System.out.println("Long Max:" + myMaxLongValue);

//casting
		// Means to treat/convert number from one type to another. Put type you want in
		// parenthesis before variable
		int myTotal = (myMinIntValue / 2);

		byte myNewByteValue = (byte) (myMinByteValue / 2);

		short myNewShortValue = (short) (myMinShortValue / 2);

//challenge
		// create a byte short and int and assign valid value. create long = 50000 +
		// (10*(byte+int+short))
		byte myByte = 126;
		short myShort = 32766;
		int myInt = 2147483646;
		long myLong = (50000L + 10L * ((long) myByte + myInt + myShort));
		System.out.println("Long value is:" + myLong);
	}

}
