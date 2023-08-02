package com.prepinsta.practice;
import java.util.Scanner;
public class Table {
	 void tables (int n) {
			{
				int i;
				for(i=1;i<=20;i++) {
					System.out.println(n+"*"+i+"="+n*i);
				}
			}
		}
	 
	 
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Table t = new Table();
		System.out.print("enter a number1");
		int n = sc.nextInt();
		t.tables(n);
	}
		
		
	
		

}