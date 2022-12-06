package com.programmers.level00.가장큰수찾기;

import java.util.Arrays;

// 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class Test {

	public static void main(String[] args) {
		solution(new int[] { 1, 8, 3 }); // 8,1
		solution(new int[] { 1, 8, 3 });// 8,1
		System.out.println(solution(new int[] { 9, 10, 11, 8 }));// 11, 2
	}

	static int[] solution(int[] array) {
		int[] answer = new int[2];
//      가장 큰 수를 담을 변수
		int max = 0;
//      가장 큰 인덱스의 번호
		int maxIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				maxIndex = i;
			}
		}
		answer[0] = max;
		answer[1] = maxIndex;
		for (int i : answer) {
			System.out.print(i+",");
		}
		System.out.println();
		return answer;
	}
}
