package com.programmers.level00.짝수는싫어요;
/* 정수 n이 매개변수로 주어질 때,
 *  n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 * */

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		solution(15); // [1, 3, 5, 7, 9, 11, 13, 15]
		Arrays.toString(solution(15));
		System.out.println(Arrays.toString(solution(15)));
	}

	static int[] solution(int n) {
		int[] answer = new int[(n + 1) / 2];

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer[i / 2] = i;
			}
		}
		return answer;
	}
}