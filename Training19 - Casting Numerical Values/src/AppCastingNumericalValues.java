import java.util.Scanner;

public class AppCastingNumericalValues {
	
	public static void main (String[]args) {
		
		byte byteValue =20;
		short shortValue =55;
		int intValue = 888;
		long longValue = 23555;
		
		float floatValue = 8834.3f;
		float floatValue2 = (float)99.3;
		double doubleValue = 32.4;
		
		
		
		Scanner inputNumber1 = new Scanner(System.in);
		
		
		System.out.print("Input a number: ");
		double inputNumber = inputNumber1.nextDouble();
		
		System.out.println(inputNumber);
		
		
		
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int) longValue;
		
		System.out.println(intValue);
		
		
		
		doubleValue = intValue;
		
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		
		byteValue = (byte)127;
		System.out.println(byteValue);
		
		
	}

}
