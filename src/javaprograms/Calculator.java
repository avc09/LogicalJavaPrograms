package javaprograms;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,op;
		System.out.println("Enter two numbers=");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("Select operation");
		op=sc.nextInt();
		double result =0;
		if(op==1) {
			result=n1+n2;
			System.out.println("Addition of number="+result);
		}else if(op==2) {
			result=n1-n2;
			System.out.println("Subtraction of number="+result);
		}else if(op==3) {
			result=n1*n2;
			System.out.println("Multiplication of number="+result);
		}else {
			result=n1/n2;
			System.out.println("Division of number="+result);
		}
	}
}
