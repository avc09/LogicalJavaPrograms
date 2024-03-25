package javaprograms;

import java.util.Scanner;

public class SumOfTwoNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number= ");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Sum of two numbers="+(a+b));
	}
}
