package accessSpecifiers;

public class Test5 {
	protected int a=10;
	
	protected void sub() {
		System.out.println("protected method");
	}
	
	protected Test5() {
		System.out.println("protected constructor");
	}

	public static void main(String[] args) {
		Test5 t2=new Test5();
		t2.sub();
		System.out.println("protected varaible "+t2.a);
	
		}

}

