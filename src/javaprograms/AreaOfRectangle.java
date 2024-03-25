package javaprograms;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length & width");
		double length=sc.nextDouble();
		double width=sc.nextDouble();
		double result= length*width;
		System.out.println("Area of rectangle ="+result);
	}
}
