package javaprograms;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int num=sc.nextInt();
		
		double result=1;
		for(int i=1;i<num;i++) {
			result=result*i;
		}
		double fac=result*num;
		System.out.println("Factorial of number="+num+" is="+fac);
	}
}
