package javaprograms;

import java.util.Scanner;

public class SumOfEvenNumbersBetnRange {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		long n=sc.nextLong();
		long sum=0;
		for(int i=0; i<n;i=i+2) {
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("Sum of even numbers="+sum);
	}
}
