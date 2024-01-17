package arraylist1;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		ArrayList ac = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add('a');
		al.add(true);
		al.add(40);
		al.add(" hello");
		al.add(10);
		al.add(50);

		System.out.println(al);
		System.out.println(al.isEmpty());

		//al.clear();

		System.out.println(al.contains(10));

		ac.add(50);
		ac.add(60);
		ac.add(70);
		ac.add(10);

		System.out.println(ac);

		 ac.addAll(al);

		 System.out.println(ac);

		// System.out.println(ac);

		 ac.removeAll(al);

		 System.out.println(ac);

		System.out.println(ac.containsAll(al));

		ac.retainAll(al);

		System.out.println(ac);

		 System.out.println(ac.toArray(args));
		 

	}

}
