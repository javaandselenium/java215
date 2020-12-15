package collections;

import java.util.ArrayList;

public class Test1 {

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
		//clear all the data in list
		//a.clear();
		//System.out.println(a.isEmpty());
		
		a.add(3,"JAVA");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}

	}

}
