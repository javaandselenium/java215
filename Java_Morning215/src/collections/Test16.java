package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test16 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(100);
		a.add(20);
		a.add(300);
		a.add(40);
		a.add(5);
		System.out.println("Before sorting "+a);
		Collections.sort(a);
		System.out.println("After sorting "+a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("Descending order "+a);

	}

}
