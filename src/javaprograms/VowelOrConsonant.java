package javaprograms;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character name=");
		char c =sc.next().charAt(0);
		switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
				System.out.println("consonent");
		}
	}
}
