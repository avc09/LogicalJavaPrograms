package javaprograms;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		double c=Math.sqrt(num);
		System.out.println("Sqaure root of "+num+" is="+c);
	}
}
