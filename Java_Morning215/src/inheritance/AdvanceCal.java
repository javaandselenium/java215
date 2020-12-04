package inheritance;

public class AdvanceCal extends BasicCal {
	public void sinTeta() {
		System.out.println("sinteta");
	}
	
	public void cosTeta() {
		System.out.println("costeta");
	}

	public static void main(String[] args) {
		AdvanceCal c=new AdvanceCal();
		c.sinTeta();
		c.cosTeta();
		c.add(10,80);
		c.sub(70,50);

	}

}
