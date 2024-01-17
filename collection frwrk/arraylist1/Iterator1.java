package arraylist1;

import java.util.Iterator;
import java.util.Vector;

public class Iterator1 {

	public static void main(String[] args) {
		
		Vector<Integer> vs = new Vector<Integer> ();
		
		vs.add(10);
		vs.add(20);
		vs.add(30);
		vs.add(40);
		vs.add(50);
		
		Iterator<Integer> itr = vs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println(itr.next());
				itr.next();	
				itr.remove();
			
		}
		
		System.out.println(vs);
	}

}
