package starter.mkt;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class scanner{
	
	
	static void add() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("First numberEnter:");
			int a =scanner.nextInt();
			
			
			System.out.println("Seceond numberEnter:");
			int b=scanner.nextInt();
			int result =a+b;
			System.out.println(" Addition result is:"+result);
			
	}
	static void subtraction() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("First numberEnter:");
			int a1 =scanner1.nextInt();
			System.out.println("Seceond numberEnter:");
			int b1=scanner1.nextInt();
			int result1 =a1-b1;
			System.out.println("subtraction result is:"+result1);
	}
	static void multipication() {
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("First numberEnter:");
			int a2 =scanner3.nextInt();
			System.out.println("Seceond numberEnter:");
			int b2=scanner3.nextInt();
			int result3 =a2*b2;
			System.out.println("Muliplication result is:"+result3);
		
	}
	static void division() {
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("First numberEnter:");
			int a3 =scanner4.nextInt();
			System.out.println("Seceond numberEnter:");
			int b3=scanner4.nextInt();
			int result4 =a3/b3;
			System.out.println("Division result is:"+result4);
			
	}
	
	public static void main(String[] args) {
		

			add();
			subtraction();
			multipication();
			division();
			

						
	}
	
		
}
