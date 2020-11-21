package methods;

public class Test5 {
	int a=10;
	static int b=20;
	
	public void abc() {
		System.out.println("abc");
	}
	
	public static void xyz() {
		System.out.println("xyz");
	}

	public static void main(String[] args) {
		System.out.println(Test5.b);
		Test5.xyz();
		
		Test5 t=new Test5();
		t.abc();
		System.out.println(t.a);
		
		

	}

}
