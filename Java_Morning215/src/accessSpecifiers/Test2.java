package accessSpecifiers;

public class Test2 {

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.cycle();
		System.out.println("Public varaible "+t.a);
		
		Test4 t1=new Test4();
		t1.sample();
		System.out.println("Deault varible "+t1.a);

	}

}
