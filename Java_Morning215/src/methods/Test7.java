package methods;

public class Test7 {
 static int numb=500;
 int no=100;
 static int number=400;
 
	public void mul() {
		System.out.println("mul");
	}
	
	public static void add() {
		System.out.println("Add");
	}
	
	public void sub() {
		System.out.println("sub");
	}
	
public static void main(String[] args) {
		System.out.println(Test7.numb);
		Test7 t=new Test7();
		System.out.println(t.no);
		System.out.println(Test7.number);
		t.mul();
		Test7.add();
		t.sub();

	}

}
