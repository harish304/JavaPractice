package com.prepinsta.practice;
import java.util.Scanner;
public class SumOfNnaturalNumbers {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number1 ");
		int num1 = sc.nextInt();
		System.out.print("enter number2 ");
		int num2 = sc.nextInt();
		
		
		int sum =0;
		for(int i = num1;i<=num2;i++) {
			sum += i;
			System.out.println( sum);
			
		}
		
		
		
		
		
		
		
		/*int sum = 0;
		for(int i = 1;i<=num;i++) {
		sum += i;
		System.out.println( sum);*/
		
	}
}
