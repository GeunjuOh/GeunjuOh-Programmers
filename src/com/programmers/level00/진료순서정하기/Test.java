package com.programmers.level00.진료순서정하기;

import java.util.Arrays;

/* 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
 * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
 * emergency가 [3, 76, 24]이므로 응급도의 크기 순서대로 번호를 매긴 [3, 1, 2]를 return합니다.
 * */
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 76, 24 }));// 3,1,2
	}

	static int[] solution(int[] emergency) {
		// 정답 배열 생성
		int[] answer = new int[emergency.length];
		// 비교 copy 배열 생성
		int[] copy = Arrays.copyOf(emergency, emergency.length);
		// 비교 copy 배열 정렬
		Arrays.sort(copy);

		// for 문으로 배열 비교
		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < copy.length; j++) {
				if (emergency[i] == copy[j])
					answer[i] = emergency.length - j;
			}
		}
		// 출력문
		for (int i : answer) {
			System.out.print(i + " ");
		}
		return answer;
	}
}
