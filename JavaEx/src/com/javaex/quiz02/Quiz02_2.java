package com.javaex.quiz02;

public class Quiz02_2 {
	public static void main(String[]args) {
		int balls = 136;
		int cap = 10;
		
		//balls를 상자에 나눠 담으려면 최소 몇 개의 상자가 필요합니까? 
		int ballsPerCap =(13);
		System.out.println(ballsPerCap);
		
		
		int cnt = balls /cap;
		
//		cnt = cnt +(balls % cap > 0 ? 1: 0);
		cnt += balls % cap > 0 ? 1: 0;
		System.out.println (cnt);
		
	}
}
