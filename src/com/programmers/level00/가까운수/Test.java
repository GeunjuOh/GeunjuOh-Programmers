package com.programmers.level00.가까운수;

import java.util.Arrays;

//정수 배열 array와 정수 n이 매개변수로 주어질 때, 

//array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요..

//가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.

public class Test {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 10, 28 }, 20)); // 28
		System.out.println(solution(new int[] { 10, 11, 12 }, 20)); // 12
	}

	static int solution(int[] array, int n) {
		int answer = 0;
//		for문으로 돌려서 인덱스끼리 비교 후 
//		(new int[] { 3, 10, 28 }, 20)); // 28
//		20-3 = 7 /	20-10=10 / 20-28 = -8
		int min = 999;
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			if (min > Math.abs(n - array[i])) {
				// 20-3 = 7
				// 20-10 = 10
				// 20-28 = 8 (절댓값)
				min = Math.abs(n - array[i]);
				answer = array[i];
			}
		}
		return answer;
	}
}
