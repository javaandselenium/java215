package constructor;

public class Demo {

	Demo(int a) {
		System.out.println("integer");
	}

	Demo(String b) {
		System.out.println("string");
	}

	Demo(double c, String a, int b) {
		System.out.println("double string and integer");
	}

	Demo(String a, int b, double c) {
		System.out.println("string int and double");
}
	public static void main(String[] args) {
		Demo d=new Demo("hello");
		Demo d1=new Demo("hi",12,78.90);
		
	}

}
