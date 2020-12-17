package ExceptionHandling;

public class Test1 {
	public static void add() {
		System.out.println("adding");
	}

	public static void main(String[] args) {
		//try {
		int i=1/0;
		//}
//		catch(ArithmeticException a) {
//		System.out.println("AE is hanlded");
//		}
		System.out.println("hello java");
		Test1.add();
	}

}
