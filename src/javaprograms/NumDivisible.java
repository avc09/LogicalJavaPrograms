package javaprograms;

import java.util.Scanner;

public class NumDivisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		
		if(number%5==0) {
			System.out.println(number+",Num is divisible by five");
		}else {
			System.out.println(number+",Not divisible by 5");
		}
	}
}
