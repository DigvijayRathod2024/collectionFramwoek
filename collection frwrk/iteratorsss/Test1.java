package iteratorsss;

import java.util.Iterator;
import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {

		Vector vs = new Vector();

		vs.add(10);
		vs.add(20);
		vs.add(30);
		vs.add(40);
		vs.add(50);

		Iterator itr = vs.iterator();
		while (itr.hasNext()) {
			itr.next();
			itr.remove();
		}

		System.out.println(vs);
	}

}
