package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.89);
		a.add("Hello");
		a.add('A');
		a.add("");
		a.add(true);
		a.add(10);
		System.out.println("Total count "+a.size());
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}

	}

}
