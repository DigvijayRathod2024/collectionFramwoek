package iteratorsss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add(19);
		al.add(1);
		al.add(16);
		al.add(5);
		al.add(9);
		al.add(10);

		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Iterator itr =al.iterator();
		
		while(itr.hasNext())
		{
			itr.next();
			
		}
		
		System.out.println(al);
		
	}

}
