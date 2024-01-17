package arraylist1;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(null);
		l.add(true);
		l.add(20);

		System.out.println(l);

		 System.out.println(l.getFirst());

		 System.out.println(l.getLast());

		System.out.println(l.removeFirst());

		System.out.println(l.removeLast());


		// System.out.println(l.get(2));

		// System.out.println(l.peek());

		// System.out.println(l.peekFirst());

		// System.out.println(l);

		// System.out.println(l.pollFirst());

		// System.out.println(l);

		// System.out.println(l.peekFirst());

		// System.out.println(l);

	}

}
