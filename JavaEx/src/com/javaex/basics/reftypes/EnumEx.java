package com.javaex.basics.reftypes;

public class EnumEx {

	public static void main(String[] args) {
	  enumEx();
	}
  
	public static void enumEx () {
		Week today = Week.WEDNESDAY;
		
		System.out.printf(
				"오늘은 %s (%d) 입니다.",
			today.name(), // 열거 상수 -> 문자열 
		    today.ordinal ()) ; // 열거 상수 내순번 
		
		Week obj = Week.valueOf("FRIDAY");
		
		System.out.printf("%s , %d",
				obj.name(), obj.ordinal());
		
		System.out.printf("%s 와 %s의 순번차 : %d%n",
				today.name(), obj.name(), today.compareTo(obj));
		
		Week[] days = Week.values();
		
		System.out.println(Arrays.toString(days));
	}
}
