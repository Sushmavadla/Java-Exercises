package exceptions;
import java.util.*;
public class ExceptionArray {
public static void main (String args[]) {
	try {
		  int [] arr= {20,30,40};
		  int number=arr[5];
		  System.out.println("Element at index 5: " + number);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
	}
}
}
