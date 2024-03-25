package javaprograms;

import java.util.Scanner;

public class PowerOfNum {
	public static void main(String[] args) {
		int num,power;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num, power=");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		double result=1;
		for(int i=1;i<=b;i++) {
			result=a*result;
		}
		System.out.println("Power of number="+result);
	}
}
