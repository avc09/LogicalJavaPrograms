package javaprograms;

import java.util.Scanner;

public class LowerUppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			char ch1=Character.toLowerCase(ch);
			System.out.println("LowerCase="+ch1);
		}else {
			char ch1=Character.toUpperCase(ch);
			System.out.println("UpperCase="+ch1);
		}
	}
}
