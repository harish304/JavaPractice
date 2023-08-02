package com.prepinsta.practice;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number ");
		int num1= sc.nextInt();
		System.out.print("enter a number ");
		int num2 = sc.nextInt();
		int count = 0;
		
		for(int i = num1;i<=num2;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0){
					count++;
			}
		}
			if(count == 0) {
				System.out.println(i);
			}
		
		
		
		
		/*if(num<2) {
			System.out.print("not prime ");
		}
		for(int i =1;i<=num;i++) {
			if(num%i==0) {
				count = count +1;			}
		}
		if(count >2) {
			System.out.print("not prime ");
			
		}
		else {
			System.out.print(" prime ");
		}
		*/
		

}}
}
