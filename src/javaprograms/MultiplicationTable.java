package javaprograms;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Table number=");
		long num=sc.nextLong();
		
		for(int i=1;i<=10;i++) {
			long result=num*i;
			System.out.println(result);
		}
		
	}
}
