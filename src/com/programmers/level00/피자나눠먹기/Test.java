package com.programmers.level00.피자나눠먹기;

/*
 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 
 * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
 * */
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(15)); // 3
	}

	static int solution(int n) {
		int pizza = 7;
//		필요한 피자 개수 = (인원 n 명이 들어 오는 수 + 총 피자조각-1) / 총 피자조각
		return ((n + (pizza - 1)) / 7);

	}
}
