package task3;

import java.util.Scanner;

public class App {
	static Scanner input=new Scanner(System.in);
	static double a,b;
	public static void main(String args[]) {
		takeInputs();
		
		System.out.println("Enter Your Choice of Arithmetic Operation to be performed : ");
		System.out.println("1) +");
		System.out.println("2) -");
		System.out.println("3) *"); 
		System.out.println("4) /");
		char choice=input.next().charAt(0);
		
		calculateResult(choice);
	}
	
	public static void takeInputs() {
		System.out.println("Enter First Number : ");
		a=input.nextDouble();
		System.out.println("Enter Second Number : ");
		b=input.nextDouble();
	}
	
	public static void calculateResult(char choice) {
		ArithmeticOperations operation=new ArithmeticOperations();
		double result;
		switch(choice) {
		case '+':
			result=operation.add(a,b);
			System.out.println("The result from Addition is :"+result);
			break;
		case '-':
			result=operation.subtract(a,b);
			System.out.println("The result from Subtraction is :"+result);
			break;
		case '*':
			result=operation.multiply(a,b);
			System.out.println("The result from Multiplication is :"+result);
			break;
		case '/':
			result=operation.divide(a,b);
			System.out.println("The result from Division is :"+result);
			break;
		}
	}
	
}