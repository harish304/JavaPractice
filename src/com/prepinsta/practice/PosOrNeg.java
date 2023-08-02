package com.prepinsta.practice;

import java.util.Scanner;

public class PosOrNeg {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		

}
}
