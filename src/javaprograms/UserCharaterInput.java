package javaprograms;

import java.util.Scanner;

public class UserCharaterInput {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character=");
		char c =sc.next().charAt(2);
		
		System.out.println("Given character is,"+c);
	}
}
