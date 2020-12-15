package collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.89);
		a.add("Hello");
		a.add('A');
		
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add(20);
		a1.add("H");
		a1.add('B');
		
		//System.out.println(a.retainAll(a1));
		System.out.println(a.removeAll(a1));
		

	}

}
