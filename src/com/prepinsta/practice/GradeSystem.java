package com.prepinsta.practice;
import java.util.Scanner;
public class GradeSystem {
	 public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
			System.out.print("enter a number1");
			int marks = sc.nextInt();
			if(marks<0 || marks>100) {
				System.out.println("invalid");
			}
			else if(marks >=50 && marks < 60){
				System.out.println("D");
			}
			else if(marks >=60 && marks <70){
				System.out.println("C");
			}
			else if(marks >=70 && marks  <  80){
				System.out.println("B");
			}
			else if(marks >=80 && marks  <  90){
				System.out.println("A");
			}
			else if(marks >=90 && marks  <= 100){
				System.out.println("A+");
			}
			else {
				System.out.println("-----");
			}
			
			
				
			}

}
