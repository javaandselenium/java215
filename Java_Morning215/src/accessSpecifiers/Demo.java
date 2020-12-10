package accessSpecifiers;

public class Demo {
	public int a=20;
	
	public Demo() {
		System.out.println("public constructor");
	}
	
	public void bike() {
		System.out.println("Bike public");
	}

	public static void main(String[] args) {
		Demo d=new Demo();
		d.bike();
		System.out.println("Public varaible "+d.a);

		Test3 t=new Test3();
		t.demo();
	System.out.println("private varaible "+t.a);

	}

}
