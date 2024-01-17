package arraylist1;

import java.util.ListIterator;
import java.util.Vector;

public class ListIterator1 {

	public static void main(String[] args) {
		
		Vector ds = new Vector();
		
		ds.add(50);
		ds.add(51);
		ds.add(52);
		ds.add(53);
		ds.add(54);
		
		ListIterator ltr = ds.listIterator();
		
		while(ltr.hasNext())
		{
			//System.out.println(ltr.next());
			
			System.out.println(ltr.next());
			
		}
	}

}
