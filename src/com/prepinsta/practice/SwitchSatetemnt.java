package com.prepinsta.practice;

import java.util.Scanner;

public class SwitchSatetemnt {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a choice ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Selected 1 St Choice ");
			break;
		case 2:
			System.out.println("Selected 2 nd Choice ");
			break;
		case 3:
			System.out.println("Selected 3 rd Choice ");
			break;
		case 4:
			System.out.println("Selected 4 th Choice ");
			default:
				System.out.println("invalid");
		
		}
			

}
}

