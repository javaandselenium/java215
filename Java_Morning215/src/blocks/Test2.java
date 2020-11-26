package blocks;

public class Test2 {
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("non static block");
	}
	
	Test2(){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Test2 t=new Test2();

	}

}
