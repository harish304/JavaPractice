package com.prepinsta.practice;
import java.util.Scanner;
public class operations {
	
	public int add(int num1,int num2) {
		int sum =0;
		sum = num1 + num2;
		return sum;
	}
	public int sub(int num1,int num2) {
		int sub =0;
		sub = num1 - num2;
		return sub;
	}
	public int multiply(int num1,int num2) {
		int multiply =0;
		multiply = num1 * num2;
		return multiply;
	}
	public int divison(int num1,int num2) {
		int div =0;
		div = num1 / num2;
		return div;
	}
	public int modular(int num1,int num2) {
		int mod =0;
		mod = num1 % num2;
		return mod;
	}
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number1");
		int num1 = sc.nextInt();
		System.out.print("enter a number2");
		int num2 = sc.nextInt();
		
		
		
		operations o = new operations();
		System.out.println(o.add(num1, num2));
		System.out.println(o.sub(num1, num2));
		System.out.println(o.multiply(num1, num2));
		System.out.println(o.divison(num1, num2));
		System.out.println(o.modular(num1, num2));
	
	/* System.out.println((num1+num2));
	 System.out.println((num1-num2));
	 System.out.println((num1*num2));
	 System.out.println((num1/num2));
	 System.out.println((num1%num2));*/
	 }
	
	

}
