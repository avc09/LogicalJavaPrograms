package javaprograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int a=num;
		int s=0;
		while(num>0) {
			int c=num%10;
			s=(s*10)+c;
			num=num/10;
		}
		if(s==a) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not palindrome");
	}
}
