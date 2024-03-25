package javaprograms;

import java.util.Scanner;

public class AverageOfSubjects {
	
	public static void main(String[] args) {
		int subj1,subj2,subj3,subj4,subj5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five subjects marks=");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		int s5=sc.nextInt();
		double avg=((s1+s2+s3+s4+s5)/2);
		System.out.println("Avg marks of 5 subjects="+avg);
	}
}
