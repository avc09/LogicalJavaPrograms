package javaprograms;

import java.util.Scanner;

public class DayName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code");
		int code=sc.nextInt();
		
		switch(code) {
		case 0:
			System.out.println("Monday");
			break;
		case 1:
			System.out.println("Tuesday");
			break;
		case 2:
			System.out.println("Wensday");
			break;
		case 3:
			System.out.println("Thrusday");
			break;
		case 4:
			System.out.println("Friday");
			break;
		case 5:
			System.out.println("Saturday");
			break;
		case 6:
			System.out.println("Sunday");
			break;
			
			default:
				System.out.println("Invalid code");
		}
			
	}
}
