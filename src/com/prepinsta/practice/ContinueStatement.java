package com.prepinsta.practice;

import java.util.Scanner;

public class ContinueStatement {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number ");
		int low = sc.nextInt();
		int high = sc.nextInt();
	for(int i=low;i<=high;i++) {
	
		if(i%2==0)
			continue;
		System.out.println(i+" ");
		
	
}
	}
}
