package collections;

import java.util.LinkedHashMap;

public class Test11 {

	public static void main(String[] args) {
	LinkedHashMap<String,Integer>t=new LinkedHashMap<String,Integer>();
	t.put("Ramesh",1234);
	t.put("Mamesh",5678);
	t.put("Gamesh",5678);
	t.put("Suresh",5678);
	t.put("Gamesh",5678);
	System.out.println(t.keySet());
	System.out.println(t);
	System.out.println(t.values());

	}

}
