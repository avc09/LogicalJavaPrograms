package javaprograms;

import java.util.Scanner;

public class SwipeOfTwoNumbers {
	public static void main(String[] args) {
		int num1,num2,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 & num2");
		 num1=sc.nextInt();
		 num2=sc.nextInt();
		System.out.println("Before swapping "+num1+","+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping"+num1+","+num2);
	}
}
