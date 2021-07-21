package com.javaex.basics.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
//		 defineArray();
//		 multiDimArray();
		 arrayCopySystem() ;
		
		
		 
	}
	
	private static void arrayCopySystem() {
		int source[] = {1,2,3};
		int target[] = new int [10];
		
		//복사 
		System.arraycopy(source,  //원본 배열 , 
				0, // 복사시작 인덱스 
				target,  // 복사대상 배열 
				0, // 대상 배열의 복사 시작인덱스 
			source.length); // 복사할 길이 
		
		// 편리한 배열의 출력 
		System.out.println(source);
		System.out.println("원본:" + Array.toString(source));
		System.out.println("타겟:" + Array.toString(target));
	}
	
	private static void arrayCopyFor () {
		//배열은 크기 변경 불가 
		// 새 배열은 생성 복사 
		int source[] = {1,2,3};
		int target[] = new int [10]; // 10개 배열이 5
		
		 // 복사 
//		 for(int i=0; i< source.length; i++) {
//			target[i] = source[i];
//	}
		//Enhanced For 
		for (int value:source) {
			System.out.println(value + "\t");
			
		}
		System.out.println();

	 // 소스 배열 출력 
	 for(int i=0; i< source.length; i++) {
		 System.out.println(source[i]+"\t");
	 }
//	 // 타겟 배열  출력 
//	 for(int i=0; i< source.length; i++) {
//		 System.out.println(target[i] + "\t");
//	 }
	 for (int value.target) {
		 System.out.println(value + "\t");
	 }
	 System.out.println();
}

    private static void multiDimArray() {
    	//2차원 배열의 선언
    	int [][] twoDim = new int [5] [10] ;  //10개의 배열이 5행 연결된 구조
    	
    	int table [][] = {
    			{1,2,3,4,5,6,7,8,9,0}, //0행 
    			{2,3,4,5,6,7,8,9,0,1},
    			{3,4,5,6,7,8,9,0,1,2},
    			{4,5,6,7,8,9,0,1,2,3},
    			{5,6,7,8,9,0,1,2,3,4}
    			}; // 5행 10열의 배열 
    	System.out.println (" table.length:" + table.length);
    	//table 의 인덱스 범위 : 0 ~ table.length -1
    	System.out.println("table[2.length:" + table[2].length);
    	// table[2] 인덱스 범위 : 0 ~ table[2].length -1
    	
    	// 루프를 돌려서 내부 요소의 총합을 구해보
    	int sum =0;
    	// 행 루프 
    	for (int row = 0; row < table.length; row++) {
    		//  열 루프 
    		for (int col = 0; col < table[row].length; col++ ) {
    			sum += table[row][col];
    			
    		}
    	}
    	
    System.out.println("총합:" +sum);
    }
    
	private static void defineArray() {
		// 선언
		String[] names; //타입[] 식별자 
		int scores []; // 타입 식별자 []
		
	// 일반적인 초기화 
		scores = new int [4]; // 사이즈 지정
		// 인덱스 접근 
		// 범위 : 0~, length -1 
		scores[0] =80;
		scores[1]= 90;
		scores[2]= 85;
		scores[3]= 88;
//		scores[4]= 100; // ArrayIndexoutofboundsexception
		
		// 데이터를 가지고 있다.
	names = new String[] {"홍길동","임꺽정" , "장갈산 " , "전우치 " };
	
	// 데이터를 가지고 있다, 선언과 동시에 초기화를 할 때 
	float heights[]= {175.3f, 180.5f, 1902f, 165.2f};
	
	//.length :배열의 길이 
	System.out.println("name의 길이 :"+names.length);
	
	//인덱스는 0 부터 .length - 1까
	for(int i =0; i<= names.length; i++) {
		System.out.printf("%s(%.2f) : scores = "%d%n",
				+ names[i], heights[i], scores[i]);
		
		// 배열은 참조 타입이다.
	int scores2[] = scores;
	
	System.out.ptintln("scores:"+ Arrays.toString(scores));
	System.out.ptintln("scores2:"+ Arrays.toString(scores2));
	 
	scores2[2] = 100; // 참조 복사 : 객체를 복사한 것이 아니라 주소만 복사
	                 // 같은 객체를 참
	
	System.out.ptintln("scores:"+ Arrays.toString(scores));
	System.out.ptintln("scores2:"+ Arrays.toString(scores2));
	
	}
}
}