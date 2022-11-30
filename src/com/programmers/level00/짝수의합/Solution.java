package com.programmers.level00.짝수의합;

//	정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

public class Solution {

	public int solution(int n) {
		int answer=0;
				
		//1부터 n까지의 모든 짝수의 합 구하기
		//1. for은으로 1부터 n 까지 순회
		
		for (int i = 1; i < n; i++) {
		//2. 순회한 값을 2와 나머지 연산해서 짝수를 탐색.
			if(i%2==0) answer+=i;
		}
		return answer;
		
		
		//3. 미리 조기화 한 answer값에 당색한 짝수를 합연산.
		
		
		
		
		
}
}