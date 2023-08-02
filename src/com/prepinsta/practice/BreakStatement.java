package com.prepinsta.practice;
import java.util.Scanner;
public class BreakStatement {
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number ");
		int low = sc.nextInt();
		int high = sc.nextInt();
	for(int i=low;i<=high;i++) {
		System.out.println(i+" ");
		if(i%13==0)
			break;
		
	}
	/*int i = low;
	while(i<=high) {
		System.out.println(i+" ");
		if(i%13==0)
			break;
		i++;
		
	}*/
}
	
		
}
	
