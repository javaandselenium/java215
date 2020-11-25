package constructor;

public class Test1 {
	//Non parameterized constructor
	Test1(){
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	Test1(int a,int b){
		System.out.println(a-b);
	}
	

	public static void main(String[] args) {
		Test1 t=new Test1();
		Test1 t1=new Test1(100,50);

	}

}
