package javaprograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int arm=0;
		int c=num;
		while(num>0) {
			int rem=num%10;
			arm=(rem*rem*rem)+arm;
			num=num/10;
		}
		if(c==arm) {
			System.out.println("Armstrong number");
		}else
			System.out.println("Not armstrong");
	}
}
