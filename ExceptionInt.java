package exceptions;
import java.util.*;
public class ExceptionInt {
	public static void main(String args[]) {
try {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your birth year");
	int year=s.nextInt();
}
catch(InputMismatchException e) {
	{
		System.out.println("Wrong input");
	}
}
}
}
