package javaprograms;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age=");
		double age = sc.nextDouble();
		if(age<18) {
			System.out.println("You are not eligible for voting,"
					+ "you are under age "+age);
		}else {
			System.out.println("Congrats...!You are eligible for vote,"
					+ "your age is "+age);
		}
	}
}
