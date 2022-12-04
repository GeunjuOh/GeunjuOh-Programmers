package com.programmers.level00.문자열정렬하기;

import java.util.Arrays;

// 문자열 my_string이 매개변수로 주어질 때,
// my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
public class Test {

	public static void main(String[] args) {
		System.out.println(solution("p2o4i8gj2")); // [2, 2, 4, 8]
		System.out.println(solution("abcde0")); // [0]
		System.out.println(solution("hi12392")); // [1, 2, 2, 3, 9]
	}
//	아래 코드는 통과하였으나, 실행문을 변경해야합니다.
	
	static int[] solution(String my_string) {
		String replace = "";
		replace = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
		String[] strArr = replace.split("");
		int[] answer = new int[replace.length()];

		for (int i = 0; i < strArr.length; i++) {
			answer[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(answer);
		return answer;
	}
}
