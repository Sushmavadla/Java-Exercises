package exceptions;
import java.util.*;
public class ArithExceptionEx {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    try {
    	System.out.print("Enter the numerator: ");
        int num = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int den = scanner.nextInt();
        int res = num / den;
        System.out.println("Result: " + res);
    }
    catch(ArithmeticException e) {
    	System.out.println(e.getMessage());
    }
	}
}
