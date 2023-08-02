package com.prepinsta.practice;
import java.util.Scanner;
public class EvenOrOdd {
 public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
		System.out.print("enter a number1");
		int num1 = sc.nextInt();
	if(num1%2==0) {
		System.out.println("Number is even");
	}
	else {
		System.out.println("Number is odd");
	}
 }
}
