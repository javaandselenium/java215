package accessSpecifiers;

public class Test3 {
	private int a=100;
	
	private void demo() {
		System.out.println("Private method");
	}
	
	private Test3() {
		System.out.println("private constructor");
	}

	public static void main(String[] args) {
		Test3 t=new Test3();
			t.demo();
		System.out.println("private varaible "+t.a);
		
		Test5 t2=new Test5();
		t2.sub();
		System.out.println("protected varaible "+t2.a);

	}

}
