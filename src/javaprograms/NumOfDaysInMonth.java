package javaprograms;

import java.util.Scanner;

public class NumOfDaysInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month number");
		int num=sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Jan=31days");
			break;
		case 2:
			System.out.println("Feb=28days");
			break;
		case 3:
			System.out.println("March=31days");
			break;
		case 4:
			System.out.println("April=30days");
			break;
		case 5:
			System.out.println("May=31days");
			break;
		case 6:
			System.out.println("June=30days");
			break;
		case 7:
			System.out.println("July=31days");
			break;
		case 8:
			System.out.println("Aug=31days");
			break;
		case 9:
			System.out.println("Sep=30days");
			break;
		case 10:
			System.out.println("Oct=31days");
			break;
		case 11:
			System.out.println("Nov=30days");
			break;
		case 12:
			System.out.println("Dec=31days");
			break;
		default:
			System.out.println("Invalid month number...!");
		}
	}
}
