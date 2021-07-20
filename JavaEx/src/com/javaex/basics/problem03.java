package com.javaex.basics;

public class problem03 {

	public static void main(String[] args) {
		for(int i = 2; 
		        i <= 9;  
				i++) {   
				System.out.println();
				
				for(int j = 2;j <= 9; j++)
					System.out.print(j+"*"+i +"="+(i*j) + "\t" );
			}
			System.out.println();
			
		}
	}
