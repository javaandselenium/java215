package methods;

public class WhatsUp1 extends Whatsup{

	public void status() {
		System.out.println("photo and videos");
	super.status();
	}
	
	public static void main(String[] args) {
		WhatsUp1 w=new WhatsUp1();
		w.status();
	}

}
