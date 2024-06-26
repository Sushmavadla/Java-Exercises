package collections;
import java.util.*;
public class HashMapLab1 {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "Chair");
	map.put(2, "Table");
	map.put(3, "Sofa");
	System.out.println("HashMap before modification: " + map);
	int key=4;
	String val="Window";
	map.put(key, val);
	System.out.println("HashMap after modification: " + map);
}
}
