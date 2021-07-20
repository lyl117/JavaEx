package com.javaex.basics;

import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int dan = scanner.nextInt();
		
		if(dan == 7) 
		for(int i =1; i<=7; i++) {
		for(int j= 1; j<=i; j++) {
			
			System.out.println("1");
			System.out.println("22");
			System.out.println("333");
			System.out.println("4444");
			System.out.println("55555");
			System.out.println("666666");
			System.out.println("7777777");
			if(j == i ) {
				System.out.println();
			}
			
			else if (dan == 4) {
			for(int a =1; a<=4; a++) {
			for(int b= 1; b<=a; b++) {
					
					System.out.println("1");
					System.out.println("22");
					System.out.println("333");
					System.out.println("4444");
					if(a == b ) {
						System.out.println();
			
		}
					else {
						scanner.close();
					}
		}

	}

      

		}
		}
	}
}
}
	
