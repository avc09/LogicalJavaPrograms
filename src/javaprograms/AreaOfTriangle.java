package javaprograms;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		int s1,s2,s3,semiperimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of sides of triangle");
		 s1=sc.nextInt();
		 s2=sc.nextInt();
		 s3=sc.nextInt();
		semiperimeter=((s1+s2+s3)/2);
		double area=Math.sqrt(semiperimeter*(semiperimeter-s1)*(semiperimeter-s2)*(semiperimeter-s3));
		System.out.println(area);
	}
}
