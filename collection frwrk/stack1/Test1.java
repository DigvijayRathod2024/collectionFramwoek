package stack1;

import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		
		Stack<Comparable> st = new Stack<Comparable>();
		
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(null);
		st.add("hello");
		st.add(10);
	
		
		// System.out.println(st);
	
		st.add(22);
		
		System.out.println(st);
		
		// System.out.println(st.pop()); 
		
		// st.pop();
		
		// System.out.println(st);
		
		
		//System.out.println(st.peek());
		
		
		// System.out.println(st);
		
		
		// System.out.println(st.empty());
		
		System.out.println(st.search(22));
		
		

	}

}
