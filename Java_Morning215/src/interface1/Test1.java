package interface1;

public class Test1 implements Calculator{


	@Override
	public void add() {
		System.out.println(10+20);
		
	}

	@Override
	public void sub() {
		System.out.println(20-10);
	}

	@Override
	public void mul() {
		System.out.println(10*20);
		
	}
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.add();
		t.sub();
		t.mul();
	}

}
