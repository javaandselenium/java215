package inheritance;

public class Parent extends GrandParent{
public void car() {
	System.out.println("car property from parent");
}

public static void main(String[] args) {
	Parent p=new Parent();
	p.car();
	p.home();
	
}
}
