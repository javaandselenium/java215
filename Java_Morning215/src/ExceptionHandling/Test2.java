package ExceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		try {
		System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("AIOE is handled");
		}
		catch(ArithmeticException b) {
			System.out.println("AE is handled");
		}
		System.out.println("Hello");

	}

}
