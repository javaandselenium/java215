package polymorphism;

public class Ecommerce {
	public void shopping() {
		System.out.println("Shopping app");
	}
}

class Amazon extends Ecommerce{
	public void shopping() {
		System.out.println("Shopping from Amazon");
	}
}

class Myntra extends Ecommerce{
	public void shopping() {
		System.out.println("Shopping from Myntra");
	}
}

class Flipkart extends Ecommerce{
	public void shopping() {
		System.out.println("Shopping from Flipkart");
	}
}

class Test1{
	public static void main(String[] args) {
		Ecommerce e=new Myntra();
		e.shopping();
	}
}
