package collections;

import java.util.TreeMap;

public class Test9 {

	public static void main(String[] args) {
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
		t.put("Ramesh",1234);
		t.put("Mamesh",5678);
		t.put("Gamesh",5678);
		t.put("Suresh",5678);
		t.put("Gamesh",5678);
		System.out.println(t);

	}

}
