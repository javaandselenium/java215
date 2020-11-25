package constructor;

public class Add {
	Add(int a, int b) {
		System.out.println(a + b);
	}

	Add(int a, double b) {
		System.out.println(a + b);
	}

	Add(int a, int b, double c) {
		System.out.println(a + b + c);
	}

	Add(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	
	public static void main(String[] args) {
		Add a=new Add(20,30,40.90);
		Add a1 = new Add(20,50);
	}

}
