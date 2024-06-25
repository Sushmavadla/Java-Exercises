package collections;
import java.util.*;
public class HashSetLab {
public static void main(String[] args) {
	Set<Integer> hash=new HashSet<>(Arrays.asList(5,10,15,20,25));
	System.out.println(hash);
	boolean check=hash.contains(10);
	System.out.println(check);
	hash.remove(15);
	System.out.println(hash);
	System.out.println(hash.size());
}
}
