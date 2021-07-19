package com.javaex.basics;

public class OperatorEx {
	public static void main(String[]args) {
	   arithOperEx();	
	}
	
	// 산술 연산
	private static void arithOperEx( ) {
		int a = 7, b=3;
		
		// 부호 연산자: +,-
		System.out.println(-a);
		
		// 사칙 연산: +,-,*,/
	    System.out.println(a/b); //int / int => int
	    System.out.println(a%b); //정수 나눗셈의 나머지
	    
	    // 실제 해 구하기
	    System.out.println((float) a/ (float)b);
	    System.out.println((float) a/b);
	    
	}

}
