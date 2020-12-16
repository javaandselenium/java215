package collections;

import java.util.ArrayList;

public class Test13 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.89);
		a.add("Hello");
		a.add('A');
		a.add("");
		a.add(true);
		a.add(10);
		for(Object b:a) {
			System.out.println(b);
		}

	}

}
