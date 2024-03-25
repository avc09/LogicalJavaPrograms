package javaprograms;

import java.util.Scanner;

public class SumOfNaturalNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of term to sum of Natural Numbers=");
		long n=sc.nextLong();
		long sum=0;
		for(int i =1; i<=n;i++) {
			sum=sum+i;	
		}
		System.out.println("Addition="+sum);
	}
}
