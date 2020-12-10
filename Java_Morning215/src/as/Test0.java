package as;

import accessSpecifiers.Demo;
import accessSpecifiers.Test1;
import accessSpecifiers.Test3;
import accessSpecifiers.Test4;

public class Test0 {

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.cycle();
		System.out.println("Public varaible "+t.a);

		Demo d=new Demo();
		d.bike();
		System.out.println("Public varaible "+d.a);

		
	}

}
