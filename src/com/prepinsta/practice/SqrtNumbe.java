package com.prepinsta.practice;

import java.util.Scanner;

public class SqrtNumbe {
	public double square(double num1) {
 double sqr = 0.0;
		sqr = Math.sqrt(num1);
		return sqr;
	}
	double qubic (double num1) {
		double qub =0.0;
		qub = Math.cbrt(num1);
		return qub;
				
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number1");
		double num1 = sc.nextDouble();
		SqrtNumbe SN  = new SqrtNumbe();
		System.out.println(SN.square(num1));
		System.out.println(SN.qubic(num1));
		

}
}
