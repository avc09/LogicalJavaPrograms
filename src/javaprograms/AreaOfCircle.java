package javaprograms;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle=");
		double r=sc.nextDouble();
		final double PI=3.14;
		double c=((PI)*(r*r));
		System.out.println("Area of Circle is="+c);
	}
}
