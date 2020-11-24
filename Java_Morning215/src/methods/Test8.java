package methods;

public class Test8 {
	
public void send(int numbers) {
	System.out.println("sending numbers");
}

public void send(String msg,int numbers) {
	System.out.println("sending message and numbers");
}

public void send(String photos,double videos,String docs) {
	System.out.println("photos and videos and docs");
}

public void send(String location,String message,String photos,String docs) {
	System.out.println("location msg and photos and docs");
}
	
public static void main(String[] args) {
	Test8 t=new Test8();
	t.send("hello ge", 786645447);
	t.send("photo",657.987,"docs");
	}

}
