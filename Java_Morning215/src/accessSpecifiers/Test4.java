package accessSpecifiers;

public class Test4 {
	int a=10;
	
	void sample() {
		System.out.println("Default method");
	}
	
	Test4(){
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		Test4 t=new Test4();
		t.sample();
		System.out.println("Deault varible "+t.a);
	}

}
