package collections;

import java.util.TreeSet;

public class Test18 {

	public static void main(String[] args) {
	TreeSet t=new TreeSet<>();
	t.add(20);
	t.add(30);
	t.add(10);
	t.add(8);
	t.add(100);
	System.out.println(t);
	System.out.println("Hello");
	
	System.out.println(t.descendingSet());

	}

}
