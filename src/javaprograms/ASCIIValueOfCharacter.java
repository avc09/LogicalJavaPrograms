package javaprograms;

import java.util.Scanner;

public class ASCIIValueOfCharacter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chracter=");
		char ch=sc.next().charAt(0);
		
		int a =ch;
		System.out.println("ASCII value of character "+ch+" is="+a);
	}
}
