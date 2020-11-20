package methods;

public class Test1 {

	static String name="Ramesh";
	static	String bankName="XYZ";
	static	int balance=1000;
	static int withdrawAmt=500;
	
	public static void withdrawal() {
		int currentBal = balance-withdrawAmt;
		System.out.println(currentBal);
	}
	
	public static void main(String[] args) {
		withdrawal();

	}

}
