package iteratorsss;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {

		Stack st =new Stack();
		
		st.add(34);
		st.add(5);
		st.add(67);
		st.add(55);
		st.add(89);
		st.add(3);
		
		System.out.println(st);
		
		Collections.sort(st);
		
		System.out.println(st);
		
		Iterator itr =st.iterator();
		
		while (itr.hasNext()) {
			
			itr.next();
			
		
		}
		
		System.out.println(st);
		
	}

}
