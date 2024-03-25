package javaprograms;

import java.util.Scanner;

//How to take user input in our code
public class UserInput {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value= ");
		int a= sc.nextInt();
		System.out.println(a);
	}
}
