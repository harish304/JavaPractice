package com.prepinsta.practice;

import java.util.Scanner;

public class VotingSystem {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter age");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("Hey You Can Vote");
		}
		else {
			System.out.println("Hey You Cannot Vote");
		}
}
}

