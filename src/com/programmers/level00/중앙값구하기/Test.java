package com.programmers.level00.중앙값구하기;

import java.util.Arrays;

// 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
// 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
public class Test {

	public static void main(String[] args) {
//		solution(new int [] {1, 2, 7, 10, 11});
		System.out.println(solution(new int[] { 1, 2, 7, 10, 11 })); // 7
	}

	// 홀수의 array
	static int solution(int[] array) {
		int answer = 0;
		// 오름차순 정렬 Arrays.sort
		Arrays.sort(array);
		// 중앙값 return
		//배열의 길이 나누기 2를 하면 중간의 인덱스 값이 나오고 그걸 answer에 넣어서 return
		answer=array.length/2;
		
		return array[answer];
	}
}
