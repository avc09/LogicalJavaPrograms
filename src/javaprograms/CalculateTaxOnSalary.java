package javaprograms;

import java.util.Scanner;

public class CalculateTaxOnSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary=");
		double salary=sc.nextDouble();
		double tax=1;
		if(salary<10000) {
			System.out.println("No tax...!");
		}else if(salary>10000 && salary<100000) {
			tax=((salary)*.1);
			System.out.println(tax);
		}else {
			tax=((salary)*.2);
			System.out.println(tax);
		}
	}
}
