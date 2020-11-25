package constructor;

public class Test0 {
	int a=10;
	
	Test0(){
	System.out.println("constructor");	
	}
	
	public void abc() {
		System.out.println("abc");
	}

public static void main(String[] args) {
	Test0 t=new Test0();
	t.abc();
	System.out.println(t.a);
	}

}
