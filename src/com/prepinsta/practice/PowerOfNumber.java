package com.prepinsta.practice;
import java.util.Scanner;
public class PowerOfNumber {
	/*PowerOfNumber(int base ,double exp){
		double Result = 1;
		for (int i = 1;i<=exp;i++) {
			Result = Result *base;
			System.out.println(Result);
			
		}
		
	}*/
	PowerOfNumber(double exp ,int base){
		double Result = 1;
		while (exp != 0) {
		Result = Result*base;
		--exp;
		}
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter base : ");
		int base = sc.nextInt();
		System.out.print("enter expo: ");
		double exp = sc.nextInt();
		PowerOfNumber PN = new PowerOfNumber(exp,base);
	
		
}
}