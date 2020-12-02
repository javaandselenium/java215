package decisionStatements;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		//int age=2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		
		if(age>=18) {
			System.out.println("Eigible for DL");
		}
		else {
			System.out.println("Not eligible for DL");
		}

	}

}
