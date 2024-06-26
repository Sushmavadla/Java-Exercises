package collections;
import java.util.*;
public class SplitLabEx {
public static void main(String args[]) {
	String str="The school has playground. The school has so many trees. The school has classrooms";
	String word = "The";
	 String[] words = str.split("\\s+");
     int count = 0;
     for (String w : words) {
         if (w.equals(word)) {
             count++;
         }
     }
     System.out.println("The word '" + word + "' occurs " + count + " times");
}
}
