package collections;

import java.util.HashMap;

public class Test10 {

	public static void main(String[] args) {
	HashMap<String,Integer> t=new HashMap<String,Integer>();
	t.put("Ramesh",1234);
	t.put("Mamesh",5678);
	t.put("Gamesh",5678);
	t.put("Suresh",5678);
	t.put("Gamesh",5678);
	System.out.println(t);
	}

}
