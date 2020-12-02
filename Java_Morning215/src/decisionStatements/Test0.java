package decisionStatements;

import java.util.Scanner;

public class Test0 {

	public static void main(String[] args) {
	//int time=12;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the time");
	int time=s.nextInt();
	if(time<12) {
		System.out.println("Good morning");
	}
	else if(time<18) {
		System.out.println("Good Evening");
	}
	else {
		System.out.println("Good night");
	}

	}

}
