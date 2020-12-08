package typecasting;

public class Whitecolor extends Blackcolor {
	public void whitepen() {
		System.out.println("whitecolor");
	}
	
	public static void main(String[] args) {
	Blackcolor b=new Whitecolor();
	b.blackpaper();
	b.blackPen();
	
	}

}
