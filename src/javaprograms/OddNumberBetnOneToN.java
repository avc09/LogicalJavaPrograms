package javaprograms;

import java.util.Scanner;

public class OddNumberBetnOneToN {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of term=");
		long n=sc.nextLong();
		for(int i=1;i<=n;i++) {
			while(i%2!=0) {
				System.out.println("odd number"+i);
				i++;
			}
		}
	}
}
