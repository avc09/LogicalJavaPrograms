package javaprograms;

import java.util.Scanner;

public class EvenNumberBetnOneToN {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of term=");
		long n= sc.nextLong();
		for(int i=0;i<=n;i=i+2) {
			System.out.println(i);
		}
	}
}
