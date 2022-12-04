package com.programmers.level00.n의배수구하기;

import java.util.ArrayList;

// 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
// numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
public class Test {

	public static void main(String[] args) {
//		solution(3, new int[] { 4, 5, 6, 7, 8, 9, 10, 11, 12 });
//		solution(5, new int[] { 1, 9, 3, 10, 13, 5 });// [10, 5]
//		solution(3, new int[] { 4, 5, 6, 7, 8, 9, 10, 11, 12 });// [6, 9, 12]
		solution(5, new int[] { 12, 100, 120, 600, 12, 12 });// [120, 600, 12, 12]
	}

	static int[] solution(int n, int[] numlist) {
//		n의 배수만 출력해야함. 그러면 나누기를 한 수가 필요하다.
		ArrayList<Integer> answer_AL = new ArrayList<>();

		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer_AL.add(numlist[i]);
			}
		}
		int[] answer = new int[answer_AL.size()];
		for (int j = 0; j < answer_AL.size(); j++) {
			answer[j]= answer_AL.get(j);
		}
		for(int ans : answer)System.out.print(ans+ " ");
		return answer;
		
	}
}
