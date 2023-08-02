package com.prepinsta.practice;

import java.util.Scanner;

public class ComparingThreeNumbers {
	ComparingThreeNumbers (int n1,int n2,int n3){
		if(n1>n2 && n1>n3) {
			System.out.println("Number N1 Is gretather Than N2 and N3");
		}
		else if(n2>n1 && n2>n3){
			System.out.println("Number N2 Is gretather Than N1 and N3");
		}
		else {
			System.out.println("Number N3 Is gretather Than N2 and N3");
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number1 : ");
		int n1 = sc.nextInt();
		System.out.print("enter a number2 : ");
		int n2 = sc.nextInt();
		System.out.print("enter a number3 :");
		int n3 = sc.nextInt();
		ComparingThreeNumbers CTN = new ComparingThreeNumbers(n1,n2,n3);
		

}
}
