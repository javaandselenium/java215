package stringClass;

public class Test0 {

	public static void main(String[] args) {
		String name = " I LOVE JAVA ";
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.concat("SELENIUM"));
		System.out.println(name.equals("i love java"));
		System.out.println(name.equalsIgnoreCase(" i love java "));
		System.out.println(name.isEmpty());
		System.out.println(name.indexOf("LOVE"));
		System.out.println(name.indexOf("Love",5));
		System.out.println(name.lastIndexOf('A'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		
 
	}

}
