package javaprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		while(num>0) {
			int rem= num%10;
			System.out.print(rem);
			num=num/10;
		}
		
	}
}
