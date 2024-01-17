package linkedhsset;

import java.util.LinkedHashSet;

public class Test1 {

	public static void main(String[] args) {

		LinkedHashSet<Comparable> ls = new LinkedHashSet<Comparable>();
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		ls.add(true);
		ls.add(null);
		
		
		System.out.println(ls);
		
	}

}
