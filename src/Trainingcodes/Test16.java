/**
 * 
 */
package Trainingcodes;

import java.util.Scanner;
public class Test16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if(age<18) {
			System.out.println("you are still a minor.please grow up!!! ");

		}

		else if (age>65) {
			System.out.println("you are a senior citizen");
		}
		else {
			System.out.println("congratulation");
		}
	}
}

