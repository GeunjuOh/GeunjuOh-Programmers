package com.programmers.level00.몫구하기;

public class SolutionTest {

	public static void main(String[] args) {

		Solution a = new Solution();
		
		System.out.println(a.solution(10,2));	//10/2 = 5
		
		System.out.println(a.solutionPlus(10, 2));//10+2 = 12

		System.out.println(a.solution1(10, 2));	//10-2 = 8
		
		System.out.println(a.solution2(10, 2));	//10%2 = 0
		
		System.out.println(a.solution3(40));
		
		System.out.println(a.solution4(1, 16)); //1/16*1000 = 62
		System.out.println(a.solution4(7, 3)); //1/16*1000	=2333
		
		
		
		
	}
}
