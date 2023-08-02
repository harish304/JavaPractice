package com.prepinsta.practice;

import java.util.Scanner;

public class GreatesofTwoNumbers {
	public String compare(int n1, int n2) {
		if(n1 > n2 ) {
			
			return "n1 is greater than n2";
		}
		else if(n2>n1){
			return  "n2 is greater than n1 ";
		}
		else {
			return "n1 is eqaul to  n2";
		}
		
		
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number1");
		int n1 = sc.nextInt();
		System.out.print("enter a number1");
		int n2 = sc.nextInt();
		GreatesofTwoNumbers GN = new GreatesofTwoNumbers();
		System.out.println(GN.compare(n1, n2));
		
	}
	
}
