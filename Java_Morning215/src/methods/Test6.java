package methods;

public class Test6 {
	static int a=100;
	int b=200;
	
	public void add() {
		System.out.println("addition");
	}
	
	public static void sub() {
		System.out.println("subtration");
	}

	public static void main(String[] args) {
		System.out.println(Test6.a);
		Test6 a=new Test6();
		System.out.println(a.b);
		a.add();
		Test6.sub();

	}

}
