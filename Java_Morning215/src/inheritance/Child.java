package inheritance;

public class Child extends Parent{
	
	public void bike() {
		System.out.println("bike is the property of the child");
	}

	public static void main(String[] args) {
	Child c=new Child();
	c.bike();
	c.car();
	c.home();

	}

}
