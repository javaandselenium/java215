package methods;

public class Test9 {
	
public void add(int a,int b) {
	System.out.println("adding two integers");
}
public void add(int a,double b) {
System.out.println("adding integers and double values");	
}
public void add(double a,int c,int b) {
	System.out.println("adding double int and int ");
}
public void add(int a,double c,int b,double a1) {
	System.out.println("adding int double int and double values");
}
public static void main(String[] args) {
	Test9 t=new Test9();
	t.add(45.6, 2, 2);
}
}
