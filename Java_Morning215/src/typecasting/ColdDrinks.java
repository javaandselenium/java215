package typecasting;

public class ColdDrinks extends HotDrinks {
	
	public void coldcoffee() {
		System.out.println("coldcoffee");
	}

	public static void main(String[] args) {
		HotDrinks h=new ColdDrinks();
		h.hotcoffee();
		h.hotwater();
		ColdDrinks c=(ColdDrinks)h;
		c.coldcoffee();
		c.hotcoffee();
		c.hotwater();
		
		
		

	}

}
