package com.programmers.level00.문자반복출력하기;

/* 문자열 my_string과 정수 n이 매개변수로 주어질 때,
 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 * */

public class Test {

	public static void main(String[] args) {

		solution("hello", 3);
		System.out.println(solution("hello", 3));
// 		hhheeellllllooo "hello"의 각 문자를 세 번씩 반복한 "hhheeellllllooo"를 return 합니다.
	}

	static String solution(String my_string, int n) {
		String answer = "";

//		1. split 으로 문자열 나누고 그 요소를 배열에 담기
		String[] str_arr = my_string.split("");

//		2. 이중 for문으로 각요소를 n번만큼 곱하기
		for(String s : str_arr) {
			for(int i = 0;i<n;i++) {
				answer+=s;
			}
		}return answer;
	}	
}
