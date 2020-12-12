package encapsulation;

public class Test0 {

	public static void main(String[] args) {
		Gmail g=new Gmail();
		System.out.println(g.getEmailId());
		g.setEmailId("selenium@gmail.com");
		System.out.println(g.getEmailId());
		
		System.out.println(g.getPassword());
		g.setPassword(5678);
		System.out.println("after cahnges "+g.getPassword());

	}

}
