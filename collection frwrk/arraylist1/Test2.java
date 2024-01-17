package arraylist1;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList al =new ArrayList ();
		 
		ArrayList ac =new ArrayList ();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add('a');
		al.add(true);
		al.add(40);
		al.add(" hello");
		al.add(10);
		al.add(50);
	
		
		al.add(2, 100);
		
		System.out.println(al);
		
		al.remove(4);
		
		System.out.println(al);
		
		System.out.println(al.indexOf(true));
		
		System.out.println(al.lastIndexOf(10));
		
		List as = al.subList(2, 6);
		
		System.out.println(as);
		
		
		ac.add(50);
		ac.add(60);
		ac.add(70);
		ac.add(10);
		
		
		ArrayList ax = new ArrayList(al);
		
		System.out.println(ax);
	//	System.out.println(al.get(3));
		
		
		
	
	
	}

}
