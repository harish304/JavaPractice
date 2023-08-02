package com.prepinsta.practice;
import java.util.Scanner;
public class LeapYearOrNot {
	LeapYearOrNot(int year){
		if(year % 400==0) {
			System.out.println("This Is Leap Year");
		}
		else if(year % 4==0 && year % 10 !=0) {
			System.out.println("This Is Leap Year");
		}
		else {
			System.out.println("This Is Not Leap Year");
		}
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year ");
		int year = sc.nextInt();
		LeapYearOrNot LP = new 	LeapYearOrNot(year);
		

}

}