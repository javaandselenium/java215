package accessSpecifiers;

public class Test1 {
	public int a=10;
	public Test1(){
		System.out.println("public constructor");
	}
	public void cycle() {
		System.out.println("public cycle");
	}

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.cycle();
		System.out.println("Public varaible "+t.a);

		Demo d=new Demo();
		d.bike();
		System.out.println("Public varaible "+d.a);

	}

}
