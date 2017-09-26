package Question2;

import java.text.DecimalFormat;

public class TestMain {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		RationalNumber obj1 = new RationalNumber(4, 5);
		RationalNumber obj2 = new RationalNumber(5, 6);
		System.out.println("First Number " + obj1);
		System.out.println("Second Number " + obj2 + "\n");

		
		//Adding	
		System.out.println("\nAdding\n" + obj1 + " + " + obj2 + " = Fraction: " + obj1.addTwoNumbers(obj2)
		+ " - Decimal: " + df.format(obj1.addTwoNumbers(obj2).convertToDouble()));
		//Subtracting
		System.out.println("\nSubtracting\n" + obj1 + " - " + obj2 + " = Fraction: " + obj1.subtractTwoNumbers(obj2)
		+ " - Decimal: " + df.format(obj1.subtractTwoNumbers(obj2).convertToDouble()));
		//Multiple
		System.out.println("\nMultipling\n" + obj1 + " * " + obj2 + " = Fraction: " + obj1.multipleTwoNumbers(obj2)
		+ " - Decimal: " + df.format(obj1.multipleTwoNumbers(obj2).convertToDouble()));
		//Divide
		System.out.println("\nDividing\n" + obj1 + " / " + obj2 + " = Fraction: " + obj1.divideTwoNumbers(obj2)
		+ " - Decimal: " + df.format(obj1.divideTwoNumbers(obj2).convertToDouble()));
		
	}

}
