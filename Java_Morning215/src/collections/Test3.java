package collections;

import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Vector a=new Vector();
		a.add(10);
		a.add(20.89);
		a.add("Hello");
		a.add('A');
		a.add(10);
		a.add(20.89);
		a.add("Hello");
		a.add('A');
		a.add("Hello");
		a.add('A');
		a.add("Hello");
		a.add(10);
		a.add(20.89);
		a.add("Hello");
		a.add('A');
		a.add(10);
		a.add('A');
		a.add(20.89);
		a.add("Hello");
		a.add('A');
		a.add("Hello");
	
	
		
		
		System.out.println("The size o the arrry "+a.size());
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("The capacity o the vector "+a.capacity());

	}

}
