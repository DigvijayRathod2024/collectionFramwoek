package mapinterface;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		
		HashMap<Comparable, String> hs = new HashMap<Comparable, String>();
		
		hs.put(2, " hello");
		hs.put(3.5f, " hello");
		hs.put(6, " hello");
		hs.put(8, " hello");
		hs.put(9, " hello");
		hs.put(33, " hello");
		hs.put(true, " hello");
		hs.put(2, " hello");
		hs.put(99, "back");
		//hs.remove(2);
		//System.out.println(hs.get(8));		
		//hs.putIfAbsent(66, "newww");
		
		//hs.put(99, "thgygy");
		hs.putIfAbsent(99, "heyyy");
		
		System.out.println(hs);
	}

}
