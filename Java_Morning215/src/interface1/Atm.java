package interface1;

public class Atm implements ATMmachine {

	@Override
	public void cardSlot() {
	System.out.println("Cashslot");
	}

	@Override
	public void pinPad() {
		System.out.println("pincode");
		
	}

	@Override
	public void cash() {
		System.out.println("cash");
		
	}
	public static void main(String[] args) {
	Atm a=new Atm();
	a.cardSlot();
	a.pinPad();
	a.cash();
	}
	

}
